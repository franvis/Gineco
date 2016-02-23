/*
Clase DAO dedicada a la consulta;
*/
package DAO;

import ClasesBase.AntecedentesFamiliares;
import ClasesBase.Consulta;
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
    
    public boolean RegistrarConsulta(Consulta c,long dni,int tipoConsulta)
    {
        String cons = "INSERT INTO sistemaCarla.Consulta VALUES (null,"
                    +"str_to_date('"+c.getFecha()+"', '%d/%c/%Y')"+",'"
                    +c.getMotivo()+"','"
                    +c.getTratamiento()+"','"
                    +c.getEstudiosComplementarios()+"','"
                    +c.getObservaciones()+"','"
                    +c.getDiagnostico()+"','"
                    +c.getTipoConsulta()+"',"+dni+")";
         
         return(conexion.executeNonQuery(cons) && registrarExamenes(c,dni,tipoConsulta));
    }
    
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

    private boolean registrarExamenes(Consulta c,long dni,int tipoConsulta) {
        boolean Resultado1 = true,Resultado2 = true;
        long ultimaConsulta = getIdUltimaConsulta(dni);
        switch(tipoConsulta)
        {
            case 0: Resultado2 = daoExamObste.registrarExamObste(c.getExamenObstetrico(), ultimaConsulta);
                    break;
            
            case 1: Resultado1 = daoExamGinec.RegistrarExamGinec(c.getExamenGinecologico(),ultimaConsulta);
                    break;
           
            case 2: Resultado1 = daoExamGinec.RegistrarExamGinec(c.getExamenGinecologico(),ultimaConsulta);
                    Resultado2 = daoExamObste.registrarExamObste(c.getExamenObstetrico(), ultimaConsulta);
                    break;
        }
     return (Resultado1 && Resultado2);  
    }

    public LinkedList<Consulta> getAllConsultasTabla(long dni) 
    {
        LinkedList<Consulta> consultas = new LinkedList<>();
        
        String consulta = "SELECT idConsulta,fecha,motivo,diagnostico,tipoConsulta FROM sistemaCarla.Consulta WHERE dniPaciente = "+dni;
        
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
