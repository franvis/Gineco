/*
 * Clase DAO dedicada a las obras sociales;
 */
package DAO;

import ClasesBase.ObraSocial;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author Fran
 */
public class DAOObraSocial {
    
    private DAOConexion conexion;
    private ResultSet rs;
    private Connection conn;
    private ObraSocial o;
    private String consulta;
    private Statement st;
    private LinkedList<ObraSocial> obras;

    public DAOObraSocial() {
        conexion = new DAOConexion();
    }
    
    /**
     * Metodo utilizado para obtener todas las obras sociales
     * @return Lista de todas las obras sociales
     */
    public LinkedList<ObraSocial> getAllObrasSociales()
    {
        obras = new LinkedList<>();
        conn = conexion.conectarBD();
        consulta = "SELECT * FROM OBRASOCIAL ORDER BY nombre ASC";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(consulta);
            while(rs.next())
            {
                o = new ObraSocial();
                o.setId(rs.getInt("idObraSocial"));
                o.setNombre(rs.getString("nombre"));
                obras.add(o);
            }
            st.close();
        }
        catch (SQLException ex) {
        }
        conexion.desconectarBD(conn);
        return obras;
    }
    
    /**
     * Metodo utilizado para registrar una obra social
     * @param o Obra Social a registrar
     * @return true si se registra correctamente, false si no se registra
     */
    public boolean registrarObraSocial(ObraSocial o)
    {
    String cons = "INSERT INTO sistemaCarla.ObraSocial VALUES (null,'"
                    +o.getNombre()+"')";
    return conexion.executeNonQuery(cons);
    }
    
     /**
     * Metodo utilizado para actualizar una Obra Social
     * @param ObraSocial Obra Social modificada para actualizar
     * @return true si se actualiza correctamente, false si no se actualiza
     */
    public boolean actualizarObraSocial(ObraSocial o)
    {
    String cons = "UPDATE sistemaCarla.ObraSocial SET nombre = '"
                    +o.getNombre()+"' WHERE idObraSocial = "+o.getId();
    return conexion.executeNonQuery(cons);
    }
    
    /**
     * Metodo utilizado para eliminar una Obra Social
     * @param ObraSocial Obra Social a eliminar
     * @return true si se elimina correctamente, false si no se elimina
     */
    public boolean eliminarObraSocial(ObraSocial o)
    {
        boolean rtdo = false;
        try {
            conn = conexion.conectarBD();
            conn.setAutoCommit(false);
            java.sql.PreparedStatement deleteObraSocial =  conn.prepareStatement(
			"DELETE FROM sistemaCarla.ObraSocial WHERE idObraSocial = ? ");
            deleteObraSocial.setInt(1, o.getId());
            deleteObraSocial.executeUpdate();
            java.sql.PreparedStatement updatePacientes = conn.prepareStatement(
                "UPDATE sistemaCarla.Paciente SET numeroAfiliado = '' WHERE obraSocial IS NULL");
            updatePacientes.executeUpdate();
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
    * Metodo utilizado para obtener una obra social
    * @param id id de la obra social a obtener
    * @return Obra Social buscada
    */
    public ObraSocial getObraSocial(int id)
    {
        conn = conexion.conectarBD();
        consulta = "SELECT * FROM OBRASOCIAL WHERE idObraSocial = "+id;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(consulta);
            if(rs.next())
            {
                o = new ObraSocial();
                o.setId(rs.getInt("idObraSocial"));
                o.setNombre(rs.getString("nombre"));
            }
            st.close();
        }
        catch (SQLException ex) {
        }
        conexion.desconectarBD(conn);
        return o;
    }

}
