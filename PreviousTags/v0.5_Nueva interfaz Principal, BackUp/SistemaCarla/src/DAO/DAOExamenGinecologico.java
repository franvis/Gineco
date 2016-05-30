/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ClasesBase.AntecedentesFamiliares;
import ClasesBase.ExamenGinecologico;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Fran
 */
public class DAOExamenGinecologico {
    
    private DAOConexion conexion;
    private AntecedentesFamiliares af;
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
}
