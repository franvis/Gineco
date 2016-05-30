/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ClasesBase.AntecedentesFamiliares;
import ClasesBase.ExamenGinecologico;
import ClasesBase.ExamenObstetrico;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Fran
 */
public class DAOExamenObstetrico {
    
    private DAOConexion conexion;
    private ExamenObstetrico eo;
    private ResultSet rs;
    private Connection conn;
    private Statement st;
    
public DAOExamenObstetrico()
{
    conexion = new DAOConexion();
}
    
public boolean registrarExamObste(ExamenObstetrico eo, long consulta)
{
String cons = "INSERT INTO sistemaCarla.ExamenObstetrico VALUES (null,"
                    +eo.getTalla()+","
                    +eo.getPeso()+","
                    +eo.getImc()+","
                    +eo.getAu()+","
                    +eo.getPa()+","
                    +eo.getLcf()+","
                    +eo.getMaf()+",'"
                    +eo.getObservaciones()+"',"
                    +consulta+")";
         
return conexion.executeNonQuery(cons);
}

    public ExamenObstetrico getExamenObste(int id) {
        String consulta = "SELECT * FROM sistemaCarla.examenObstetrico WHERE Consulta = "+id;
        
        conn = conexion.conectarBD();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(consulta);
            if(rs.next())
            {
                eo = new ExamenObstetrico();
                eo.setAu(rs.getInt("alturaUterina"));
                eo.setImc(rs.getFloat("imc"));
                eo.setLcf(rs.getInt("latidosCardioFetales"));
                eo.setMaf(rs.getBoolean("movActivosFetales"));
                eo.setObservaciones(rs.getString("observaciones"));
                eo.setPa(rs.getInt("presionArterial"));
                eo.setPeso(rs.getInt("peso"));
                eo.setTalla(rs.getFloat("talla"));
            }
            st.close();
        }
        catch (SQLException ex) {
        }
        conexion.desconectarBD(conn);
        return eo;
    }

    public boolean ActualizarExamObste(ExamenObstetrico examenObstetrico, int id) {
    eo = examenObstetrico;
    String cons = "UPDATE sistemaCarla.ExamenObstetrico SET"+
                    " talla = "+eo.getTalla()+
                    ",peso = "+eo.getPeso()+
                    ",imc = "+eo.getImc()+
                    ",alturaUterina = "+eo.getAu()+
                    ",presionArterial = "+eo.getPa()+
                    ",latidosCardioFetales = "+eo.getLcf()+
                    ",movActivosFetales = '"+eo.getMaf()+
                    "',observaciones = '"+eo.getObservaciones()+
                    "' WHERE consulta = "+id;
         
    return conexion.executeNonQuery(cons);
        
    }
    
    
}
