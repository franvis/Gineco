/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;

/**
 *
 * @author Fran
 */
public class DAOConexion {
    
    private static String login = "root";
    private static String pass = "root";
    private static String url = "jdbc:mysql://localhost:3306/sistemacarla";
    private Connection conn = null;
    private Statement st;

     public Connection conectarBD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, pass);
            if (conn != null) {
                System.out.println("Conexión a base de datos " + url + " ... Ok");
            }
        return conn;
        }
        catch (SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos " + url + " " + ex.getSQLState());
        }
        catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        catch (Exception ex) {
        }
        return null;
    }
     
     
    public void desconectarBD(Connection c) {
        try {
            c.close();
            System.out.println("Se desconectó");
        }
        catch (SQLException ex) {
            System.out.println("No se pudo cerrar");
        }
    }


    
    public boolean executeNonQuery(String cons) {
        Connection c = conectarBD();
        try {
            st = conn.createStatement();
            st.execute(cons);
            st.close();
            desconectarBD(c);
            return true;
        }
        catch (SQLException ex) {
        }
        desconectarBD(c);
        return false;
    }

//    public ResultSet executeQuery(String cons) {
//        conectarBD();
//        try {
//            st = conn.createStatement();
//            ResultSet rs = st.executeQuery(cons);
//            st.close();
//            return rs;
//        }
//        catch (SQLException ex) {
//        }
//        return null;
//    }
//    
}
