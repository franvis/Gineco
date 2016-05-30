package cambiobase;

import javax.swing.JOptionPane;

public class CambioBase {

    private static DAOConexion daoConexion = new DAOConexion();
    
    public static void main(String[] args) {
        daoConexion = new DAOConexion();
        if(daoConexion.executeNonQuery())
            JOptionPane.showMessageDialog(null, "Ejecución Existosa.");
        else
            JOptionPane.showMessageDialog(null, "Ejecución Fallida.");
    }
}
