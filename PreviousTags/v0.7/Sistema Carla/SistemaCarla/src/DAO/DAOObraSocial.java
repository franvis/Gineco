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
    
    public boolean registrarObraSocial(ObraSocial o)
    {
    String cons = "INSERT INTO sistemaCarla.ObraSocial VALUES (null,'"
                    +o.getNombre()+"')";
    return conexion.executeNonQuery(cons);
    }
    
     public boolean eliminarObraSocial(ObraSocial o)
    {
    String cons = "DELETE FROM sistemaCarla.ObraSocial WHERE idObraSocial = "
                    +o.getId();
    return conexion.executeNonQuery(cons);
    }
    
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
