/*
 * Clase DAO dedicada a los antecedentes generales
 */
package DAO;

import ClasesBase.modelo.AntecedentesGenerales;
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
    private Statement st;

    public DAOAntecedentesGenerales() {
        conexion = new DAOConexion();
    }
    
    
    /**
     * Metodo utilizado para registrar un antecedente general
     * @param agen Antecedente General a registrar
     * @param dni dni del paciente que posee ese antecedente general
     * @return true si se registra correctamente, false si no se registra
     */
    public boolean registrarAntecedentesGenerales(AntecedentesGenerales agen,long dni)
    {
         String cons = "INSERT INTO sistemaCarla.AntecedentesGenerales VALUES (null,'"
                    +agen.getAntecedentesPersonales()+"','"+agen.getAntecedentesQuirurgicos()+"','"
                    +agen.getAntecedentesToxicos()+"',"+dni+")";
        
         
         return conexion.executeNonQuery(cons);
    }
    
    /**
     * Metodo utilizado para obtener un antecedente general
     * @param dni dni del paciente cuyo antecedente se quiere obtener
     * @return Antecedente General buscado
     */ 
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
    
     /**
     * Metodo utilizado para actualizar un antecedente general
     * @param agen Antecedente General modificado para actualizar
     * @param dni dni del paciente que posee ese antecedente familiar
     * @return true si se actualiza correctamente, false si no se actualiza
     */
    public boolean actualizarAntecedente(AntecedentesGenerales agen,long dni) {
     
         String cons = "UPDATE sistemaCarla.AntecedentesGenerales SET " + 
                    "antecedentesP = '"+agen.getAntecedentesPersonales()+
                    "',antecedentesQ = '"+agen.getAntecedentesQuirurgicos()+
                    "',antecedentesT = '"+agen.getAntecedentesToxicos()+
                    "' WHERE dniPaciente = "+dni;
        
         
         return conexion.executeNonQuery(cons);
    }
}
