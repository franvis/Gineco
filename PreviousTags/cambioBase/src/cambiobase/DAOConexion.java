/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiobase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Fran
 */
public class DAOConexion {
    
    private static String login = "root";
    private static String pass = "franco";
    private static String url = "jdbc:mysql://localhost:3306/sistemaCarla";
    private Connection conn = null;
    private Statement st;
    
    
     
    /**
     * Metodo utilizado para abrir una conexion
     * @return Conexion abierta
     */ 
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
     
    /**
     * Metodo utilizado para cerrar una conexion abierta
     * @param c Conexion abierta a cerrar
     */ 
    public void desconectarBD(Connection c) {
        try {
            c.close();
            System.out.println("Se desconectó");
        }
        catch (SQLException ex) {
            System.out.println("No se pudo cerrar");
        }
    }


    /**
     * Metodo utilizado para ejecutar consultas INSERT, UPDATE y DELETE
     * @param cons Consulta a ejecutar
     * @return true si se ejecuto correctamente, false si se ejecuto incorrectamente
     */
    public boolean executeNonQuery() {
        conn = conectarBD();
        boolean rtdo = false;
        try {
            conn.setAutoCommit(false);  
            java.sql.PreparedStatement alter =  conn.prepareStatement(" DELETE FROM `SistemaCarla`.`examenObstetrico` ");
            alter.executeUpdate();
            alter = conn.prepareStatement(" DELETE FROM `SistemaCarla`.`consulta` WHERE tipoConsulta = 'Obstetrica' OR tipoConsulta = 'Completa'");
            alter.executeUpdate();
            alter = conn.prepareStatement(" ALTER TABLE `SistemaCarla`.`examenObstetrico` CHANGE `presionArterial` `presionArterial` VARCHAR(45)");
            alter.executeUpdate();
            alter = conn.prepareStatement(" ALTER TABLE `SistemaCarla`.`examenObstetrico` CHANGE `talla` `talla` FLOAT ");
            alter.executeUpdate();
            alter = conn.prepareStatement(" ALTER TABLE `SistemaCarla`.`examenObstetrico` CHANGE `peso` `peso` FLOAT ");
            alter.executeUpdate();
            alter = conn.prepareStatement(" ALTER TABLE `SistemaCarla`.`examenObstetrico` CHANGE `alturaUterina` `alturaUterina` FLOAT ");
            alter.executeUpdate();
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
            desconectarBD(conn);
        }
        return rtdo;
    }
}
