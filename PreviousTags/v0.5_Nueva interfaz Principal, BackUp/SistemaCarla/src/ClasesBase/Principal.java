/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesBase;

import DAO.DAOConexion;

/**
 *
 * @author Fran
 */
public class Principal {

    private static DAOConexion dao = new DAOConexion(); 
    public static void main(String[] args) {
       dao.conectarBD();       
       }
    }

