/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ClasesBase.AntecedentesFamiliares;
import ClasesBase.ExamenObstetrico;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Fran
 */
public class DAOExamenObstetrico {
    
    private DAOConexion conexion;
    private AntecedentesFamiliares af;
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
                    +eo.getLcf()+",'"
                    +eo.getMaf()+"','"
                    +eo.getObservaciones()+"',"
                    +consulta+")";
         
return conexion.executeNonQuery(cons);
}
    
    
}
