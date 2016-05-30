/*
Clase DAO dedicada a la consulta;
*/
package DAO;

import ClasesBase.modelo.Consulta;
import ClasesBase.modelo.ExamenGinecologico;
import ClasesBase.modelo.ExamenObstetrico;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author Fran
 */
public class DAOConsulta {
    private DAOConexion conexion;
    private DAOExamenGinecologico daoExamGinec;
    private DAOExamenObstetrico daoExamObste;
    private ResultSet rs;
    private Connection conn;
    private Statement st;
    private Consulta c;
    
    public DAOConsulta()
    {
    conexion = new DAOConexion();
    daoExamGinec = new DAOExamenGinecologico();
    daoExamObste = new DAOExamenObstetrico();
    }
    
    /**
     * Metodo utilizado para registrar una consulta
     * @param c Consulta a registrar
     * @param dni dni del paciente que posee ese antecedente ginecologico
     * @param tipoConsulta tipo de consulta de la consulta : 0(Obstetrica), 1(Ginecologica) o 2(Completa)
     * @return true si se registra correctamente, false si no se registra
     */
    public boolean RegistrarConsulta(Consulta c,long dni,int tipoConsulta)
    {
        boolean rtdo = false;
        try{
            conn = conexion.conectarBD();
            conn.setAutoCommit(false);  
            java.sql.PreparedStatement insertConsulta =  conn.prepareStatement(
                        "INSERT INTO sistemaCarla.Consulta VALUES (null,"
                        +"str_to_date('"+c.getFecha()+"', '%d/%c/%Y')"+",'"
                        +c.getMotivo()+"','"
                        +c.getTratamiento()+"','"
                        +c.getEstudiosComplementarios()+"','"
                        +c.getObservaciones()+"','"
                        +c.getDiagnostico()+"','"
                        +c.getTipoConsulta()+"',"+dni+")");
            insertConsulta.executeUpdate();
            
            c.setId((int)getIdUltimaConsulta(conn, dni));
            
            if (tipoConsulta == 0 || tipoConsulta == 2){
                ExamenObstetrico eo = c.getExamenObstetrico();
                java.sql.PreparedStatement insertExamenO =  conn.prepareStatement(
                        "INSERT INTO sistemaCarla.ExamenObstetrico VALUES (null,"
                        +eo.getTalla()+","
                        +eo.getPeso()+","
                        +eo.getImc()+","
                        +eo.getAu()+",'"
                        +eo.getPa()+"',"
                        +eo.getLcf()+","
                        +eo.getMaf()+",'"
                        +eo.getObservaciones()+"',"
                        +c.getId()+")");
                insertExamenO.executeUpdate();
            }
            
            if (tipoConsulta == 1 || tipoConsulta == 2){
                ExamenGinecologico eg = c.getExamenGinecologico();
                java.sql.PreparedStatement insertExamenG =  conn.prepareStatement(
                        "INSERT INTO sistemaCarla.ExamenGinecologico VALUES (null,'"
                        +eg.getMamas()+"','"
                        +eg.getGenitourinario()+"','"
                        +eg.getBethesda()+"','"
                        +eg.getPapycolposcopia()+"',"
                        +c.getId()+")");
                insertExamenG.executeUpdate();
            }
            
            conn.commit();
            rtdo = true;
            conn.setAutoCommit(true);
        }
        catch (Exception ex) {
            try {
                conn.rollback(); 
            }
            catch (SQLException e) {
                System.out.println("RollBack Failure." + e.getMessage());
            }
            System.out.println(ex.getMessage());
        }
        finally {
            conexion.desconectarBD(conn);
        }
        return rtdo;
    }
    /**
     * Metodo utilizado para obtener el id de la ultima consulta de un paciente
     * @param dni dni del paciente del cual queremos obtener el id de la ultima consulta
     * @return id de la ultima consulta
     */
    public long getIdUltimaConsulta(long dni)
    {
    conn = conexion.conectarBD();
    String cons = "SELECT MAX(idconsulta) AS idconsulta FROM SistemaCarla.consulta WHERE dniPaciente = "+dni;
    long ultimaConsulta = 0;
            try {
            st = conn.createStatement();
            rs = st.executeQuery(cons);
            if(rs.next())
            {
                ultimaConsulta = rs.getLong("idconsulta");
            }
            st.close();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        conexion.desconectarBD(conn);
        return ultimaConsulta;
    
    }
    /**
     * Metodo utilizado para obtener el id de la ultima consulta de un paciente embebida en una transaccion
     * @param dni dni del paciente del cual queremos obtener el id de la ultima consulta
     * @return id de la ultima consulta
     */
    public long getIdUltimaConsulta(Connection con, long dni)
    {
        conn = con;
        String cons = "SELECT MAX(idconsulta) AS idconsulta FROM SistemaCarla.consulta WHERE dniPaciente = "+dni;
        long ultimaConsulta = 0;
            try {
            st = conn.createStatement();
            rs = st.executeQuery(cons);
            if(rs.next())
            {
                ultimaConsulta = rs.getLong("idconsulta");
            }
            st.close();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return ultimaConsulta;
    
    }
    
    
    /**
     * Metodo utilizado para obtener todas las consultas de un paciente
     * @param dni dni del paciente del cual queremos obtener todas las consultas
     * @return Lista de consultas del paciente
     */
    public LinkedList<Consulta> getAllConsultasTabla(long dni) 
    {
        LinkedList<Consulta> consultas = new LinkedList<>();
        
        String consulta = "SELECT idConsulta,fecha,motivo,diagnostico,tipoConsulta FROM sistemaCarla.Consulta WHERE dniPaciente = "+dni+" ORDER BY fecha DESC, idConsulta DESC";
        
        conn = conexion.conectarBD();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(consulta);
            while(rs.next())
            {
                c = new Consulta();
                String fecha = rs.getString("fecha");
                String año = fecha.substring(0, 4);
                String mes = fecha.substring(5, 7);
                String dia = fecha.substring(8, 10);
                c.setId(Integer.parseInt(rs.getString("idConsulta")));
                c.setFecha(dia+"/"+mes+"/"+año);
                c.setMotivo(rs.getString("motivo"));
                c.setDiagnostico(rs.getString("diagnostico"));
                c.setTipoConsulta(rs.getString("tipoConsulta"));
                consultas.add(c);
            }
            st.close();
        }
        catch (SQLException ex) {
        }
        conexion.desconectarBD(conn);
        return consultas;
    }
    
    /**
     * Metodo utilizado para obtener una consulta completa de un paciente
     * @param id id de la consulta a buscar
     * @param dni dni del paciente del cual queremos obtener la consulta
     * @return Consulta completa
     */
    public Consulta getConsultaCompleta(int id, long dni) {
        
        String consulta = "SELECT * FROM sistemaCarla.Consulta WHERE dniPaciente = "+dni+" AND idConsulta = "+id;
        
        conn = conexion.conectarBD();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(consulta);
            if(rs.next())
            {
                c = new Consulta();
                String fecha = rs.getString("fecha");
                String año = fecha.substring(0, 4);
                String mes = fecha.substring(5, 7);
                String dia = fecha.substring(8, 10);
                c.setId(rs.getInt("idConsulta"));
                c.setDiagnostico(rs.getString("diagnostico"));
                c.setEstudiosComplementarios(rs.getString("estudiosComplementarios"));
                c.setObservaciones(rs.getString("observaciones"));
                c.setTratamiento(rs.getString("tratamiento"));
                c.setFecha(dia+"/"+mes+"/"+año);
                c.setMotivo(rs.getString("motivo"));
                c.setDiagnostico(rs.getString("diagnostico"));
                c.setTipoConsulta(rs.getString("tipoConsulta"));
            }
            st.close();
        }
        catch (SQLException ex) {
        }
        conexion.desconectarBD(conn);
        if(c.getTipoConsulta().compareTo("Completa") == 0 || c.getTipoConsulta().compareTo("Ginecologica") == 0)
            c.setExamenGinecologico(daoExamGinec.getExamenGinec(c.getId()));
        
        if(c.getTipoConsulta().compareTo("Completa") == 0 || c.getTipoConsulta().compareTo("Obstetrica") == 0)
            c.setExamenObstetrico(daoExamObste.getExamenObste(c.getId()));
        return c;
        
    }
    
    /**
     * Metodo utilizado para actualizar una consulta
     * @param consulta consulta modificada para actualizar
     * @return true si se actualiza correctamente, false si no se actualiza
     */
    public boolean actualizarConsulta(Consulta consulta) {
        c = consulta;
        String cons = "UPDATE sistemaCarla.Consulta SET "+
                    "motivo = '"+c.getMotivo()+
                    "',tratamiento = '"+c.getTratamiento()+
                    "',estudiosComplementarios = '"+c.getEstudiosComplementarios()+
                    "',observaciones = '"+c.getObservaciones()+
                    "',diagnostico = '"+c.getDiagnostico()+
                    "',tipoConsulta = '"+c.getTipoConsulta()+
                    "' WHERE idConsulta = "+c.getId();
         
         return(conexion.executeNonQuery(cons) && actualizarExamenes(c));
    
        
    }
    
    /**
     * Metodo utilizado para actualizar los examenes de una consulta
     * @param consulta consulta modificada que contiene los examenes a actualizar
     * @return true si se actualizan correctamente, false si no se actualizan
     */
    private boolean actualizarExamenes(Consulta c) {
        
        boolean Resultado1 = true,Resultado2 = true;
        switch(c.getTipoConsulta())
        {
            case "Obstetrica": Resultado2 = daoExamObste.ActualizarExamObste(c.getExamenObstetrico(),c.getId());
                               break;
            
            case "Ginecologica": Resultado1 = daoExamGinec.ActualizarExamGinec(c.getExamenGinecologico(),c.getId());
                                 break;
           
            case "Completa": Resultado1 = daoExamGinec.ActualizarExamGinec(c.getExamenGinecologico(),c.getId());
                             Resultado2 = daoExamObste.ActualizarExamObste(c.getExamenObstetrico(),c.getId());
                             break;
        }
     return (Resultado1 && Resultado2);  
        
    }
}
