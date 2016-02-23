/*
 * Clase DAO correspondiente a los examenes ginecologicos
 */
package DAO;

import ClasesBase.modelo.ExamenGinecologico;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Fran
 */
public class DAOExamenGinecologico {
    
    private DAOConexion conexion;
    private ExamenGinecologico eg;
    private ResultSet rs;
    private Connection conn;
    private Statement st;
    
    public DAOExamenGinecologico()
    {
    conexion = new DAOConexion();
    }
    
    /**
     * Metodo utilizado para registrar un examen ginecologico
     * @param eg Examen Ginecologico a registrar
     * @param consulta id de la consulta a la cual pertenece el examen
     * @return true si se registra correctamente, false si no se registra
     */
    public boolean RegistrarExamGinec(ExamenGinecologico eg,long consulta)
    {
    String cons = "INSERT INTO sistemaCarla.ExamenGinecologico VALUES (null,'"
                    +eg.getMamas()+"','"
                    +eg.getGenitourinario()+"','"
                    +eg.getBethesda()+"','"
                    +eg.getPapycolposcopia()+"',"
                    +consulta+")";
         
    return conexion.executeNonQuery(cons);
    }

    /**
     * Metodo utilizado para obtener un examen ginecologico
     * @param id id de la consulta de la cual se quiere obtener el examen ginecologico
     * @return Examen Ginecologico buscado
     */
    public ExamenGinecologico getExamenGinec(int id) {
        
        String consulta = "SELECT * FROM sistemaCarla.ExamenGinecologico WHERE consulta = "+id;
        
        conn = conexion.conectarBD();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(consulta);
            if(rs.next())
            {
                eg = new ExamenGinecologico();
                eg.setBethesda(rs.getString("bethesda"));
                eg.setGenitourinario(rs.getString("genitourinario"));
                eg.setMamas(rs.getString("mamas"));
                eg.setPapycolposcopia(rs.getString("papycolpo"));
            }
            st.close();
        }
        catch (SQLException ex) {
        }
        conexion.desconectarBD(conn);
        return eg;
    }
    
    
    /**
     * Metodo utilizado para actualizar un examen ginecologico
     * @param examenGinecologico Examen Ginecologico modificado para actualizar
     * @param id id de la consulta que contiene el antecedente a actualizar
     * @return true si se actualiza correctamente, false si no se actualiza
     */
    public boolean ActualizarExamGinec(ExamenGinecologico examenGinecologico,int consulta) {
    eg = examenGinecologico;
    String cons = "UPDATE sistemaCarla.ExamenGinecologico SET"+
                    " mamas = '"+eg.getMamas()+
                    "',genitourinario = '"+eg.getGenitourinario()+
                    "',bethesda = '"+eg.getBethesda()+
                    "',papycolpo = '"+eg.getPapycolposcopia()+
                    "' WHERE consulta = "+consulta;
         
    return conexion.executeNonQuery(cons);
    }
}
