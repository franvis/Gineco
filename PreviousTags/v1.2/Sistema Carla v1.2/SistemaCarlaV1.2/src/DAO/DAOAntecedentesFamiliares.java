/*
 * Clase DAO dedicada a los antecedentes familiares
 */
package DAO;

import ClasesBase.AntecedentesFamiliares;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Fran
 */
public class DAOAntecedentesFamiliares {
    
    private DAOConexion conexion;
    private AntecedentesFamiliares af;
    private ResultSet rs;
    private Connection conn;
    private Statement st;
    
    public DAOAntecedentesFamiliares() {
        conexion = new DAOConexion();
    }
    
     
    /**
     * Metodo utilizado para registrar un antecedente familiar
     * @param af Antecedente a registrar
     * @param dni dni del paciente que posee ese antecedente familiar
     * @return true si se registra correctamente, false si no se registra
     */ 
    public boolean registrarAntecedentesFamiliares(AntecedentesFamiliares af,long dni)
    {
         String cons = "INSERT INTO sistemaCarla.AntecedentesFamiliares VALUES (null,"
                    +af.isDbt()+","+af.isHta()+","
                    +af.isOncologicos()+","+af.isTiroides()+",'"
                    +af.getDescripcionTiroides()+"','"+af.getDescripcionOncologicos()
                    +"','"+af.getObservaciones()+"',"+dni+")";
         
         return conexion.executeNonQuery(cons);
    }
    
    
     
    /**
     * Metodo utilizado para obtener un antecedente familiar
     * @param dni dni del paciente cuyo antecedente se quiere obtener
     * @return Antecedente Familiar buscado
     */ 
    public AntecedentesFamiliares getAntecedenteFamiliar(long dni)
    {
    af = null;
    conn = conexion.conectarBD();
        String cons = "SELECT * FROM sistemaCarla.AntecedentesFamiliares WHERE dniPaciente = "+dni;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(cons);
            if(rs.next())
            {
                af = new AntecedentesFamiliares();
                af.setDbt(rs.getBoolean("diabetes"));
                af.setDescripcionOncologicos(rs.getString("descripcionOncologicos"));
                af.setDescripcionTiroides(rs.getString("descripcionTiroides"));
                af.setHta(rs.getBoolean("hipertension"));
                af.setObservaciones(rs.getString("Observaciones"));
                af.setOncologicos(rs.getBoolean("oncologicos"));
                af.setTiroides(rs.getBoolean("tiroides"));
            }
            st.close();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        conexion.desconectarBD(conn);
        return af;
    }

     
    /**
     * Metodo utilizado para actualizar un antecedente
     * @param af Antecedente modificado para actualizar
     * @param dni dni del paciente que posee ese antecedente familiar
     * @return true si se actualiza correctamente, false si no se actualiza
     */ 
    public boolean actualizarAntecedente(AntecedentesFamiliares af,long dni) {
        
        String cons = "UPDATE sistemaCarla.AntecedentesFamiliares SET diabetes = "
                    +af.isDbt()+",hipertension = "+af.isHta()+",oncologicos = "
                    +af.isOncologicos()+",tiroides = "+af.isTiroides()+",descripcionTiroides = '"
                    +af.getDescripcionTiroides()+"',descripcionOncologicos = '"+af.getDescripcionOncologicos()
                    +"',observaciones = '"+af.getObservaciones()+"' WHERE dniPaciente = "+dni;
         
         return conexion.executeNonQuery(cons);
        
    }
    
}
