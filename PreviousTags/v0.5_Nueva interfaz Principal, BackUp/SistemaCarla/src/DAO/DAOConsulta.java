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
        
        String consulta = "SELECT fecha,motivo,diagnostico,tipoConsulta FROM sistemaCarla.Consulta WHERE dniPaciente = "+dni;
        
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
}
