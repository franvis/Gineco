/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ClasesBase.AntecedentesGenerales;
import ClasesBase.Paciente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Fran
 */
public class DAOAntecedentesGenerales {
    
    private DAOConexion conexion;
    private ResultSet rs;
    private Connection conn;
    private AntecedentesGenerales ag;
    private String consulta;
    private Statement st;

    public DAOAntecedentesGenerales() {
        conexion = new DAOConexion();
    }
    
    
    
    public boolean registrarAntecedentesGenerales(AntecedentesGenerales agen,long dni)
    {
         String cons = "INSERT INTO sistemaCarla.AntecedentesGenerales VALUES (null,'"
                    +agen.getAntecedentesPersonales()+"','"+agen.getAntecedentesQuirurgicos()+"','"
                    +agen.getAntecedentesToxicos()+"',"+dni+")";
        
         
         return conexion.executeNonQuery(cons);
    }
    
    public AntecedentesGenerales getAntecedenteGeneral(long dni)
    {
    ag = null;
    conn = conexion.conectarBD();
        String cons = "SELECT * FROM sistemaCarla.AntecedentesGenerales WHERE dniPaciente = "+dni;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(cons);
            if(rs.next())
            {   
                ag = new AntecedentesGenerales();
                ag.setAntecedentesPersonales(rs.getString("antecedentesP"));
                ag.setAntecedentesQuirurgicos(rs.getString("antecedentesQ"));
                ag.setAntecedentesToxicos(rs.getString("antecedentesT"));
            }
            st.close();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        conexion.desconectarBD(conn);
        return ag;
    }

    public boolean actualizarAntecedente(AntecedentesGenerales agen,long dni) {
     
         String cons = "UPDATE sistemaCarla.AntecedentesGenerales SET " + 
                    "antecedentesP = '"+agen.getAntecedentesPersonales()+
                    "',antecedentesQ = '"+agen.getAntecedentesQuirurgicos()+
                    "',antecedentesT = '"+agen.getAntecedentesToxicos()+
                    "' WHERE dniPaciente = "+dni;
        
         
         return conexion.executeNonQuery(cons);
    }
}
