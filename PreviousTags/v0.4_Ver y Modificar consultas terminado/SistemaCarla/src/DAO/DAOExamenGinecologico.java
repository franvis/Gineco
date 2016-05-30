/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ClasesBase.AntecedentesFamiliares;
import ClasesBase.Consulta;
import ClasesBase.ExamenGinecologico;
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

    boolean ActualizarExamGinec(ExamenGinecologico examenGinecologico,int consulta) {
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
