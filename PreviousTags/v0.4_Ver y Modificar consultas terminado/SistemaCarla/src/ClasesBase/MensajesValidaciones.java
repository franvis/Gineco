package ClasesBase;

import GUI.ABMConsultaCompleta;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MensajesValidaciones {

    public static void negarLetrasFloat(KeyEvent evt, Component ch) {
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) ||
        (c == KeyEvent.VK_DELETE) || c == KeyEvent.VK_PERIOD)) {
            ch.getToolkit().beep();
            evt.consume();
        }
    }
    
    public static void limitarLargo(JTextField txtf, KeyEvent evt, int i,Component ch) {
        if(txtf.getText().length() == i)
        {
            ch.getToolkit().beep();
            evt.consume();
        }
    }
    
    public static void mostrarError(Component f,String error) {
         JOptionPane.showOptionDialog(
                    f,
                    error,
                    "Atención",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.ERROR_MESSAGE,
                    null,
                    null,
                    "aceptar");
    }
     
    public static void mostrarInformacion(Component f,String info)
    {
        JOptionPane.showOptionDialog(
                    f,
                    info,
                    "Atención",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    null,
                    "aceptar");
    }
    
    /**
     * metodo que corrobora que la fecha sea "valida"
     * 
     * @param d dia
     * @param m mes
     * @param a año
     */
    public static String corroborarFecha(String d, String m, String a) {
    int dia,mes,año;
    String incorrectos="";
    Calendar c = Calendar.getInstance();
    if(!d.isEmpty())
        dia = Integer.parseInt(d);
    else
        dia=0;
    
    if(!m.isEmpty())
        mes = Integer.parseInt(m);  
    else
        mes = 0;
    
    if(!a.isEmpty())
        año = Integer.parseInt(a);
    else
        año = 0;
    
    if(dia<=0 || dia >31)
        incorrectos +="Dia \n";
    
    if(mes<=0 || mes>12)
        incorrectos +="Mes \n";
    
    if(año<=1900 || año > c.get(Calendar.YEAR))
        incorrectos +="Año";
    
    return incorrectos;
    }    
    
      
     
      
    /**
     * Metodo dedicado a la prohibicion de letras en la escritura
     */
    public static void negarLetras(KeyEvent evt,Component ch) {
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) ||
        (c == KeyEvent.VK_DELETE))) {
            ch.getToolkit().beep();
            evt.consume();
        }
    }

    /**
     * Metodo dedicado a la prohibicion de letras en la escritura
     */
    public static void negarNumeros(KeyEvent evt,Component ch) {
        char c = evt.getKeyChar();
        if (!(!Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) ||
        (c == KeyEvent.VK_DELETE))) {
            ch.getToolkit().beep();
            evt.consume();
        }
        
    }
    
    public static boolean negarNumerosBool(KeyEvent evt,Component ch) {
        char c = evt.getKeyChar();
        if (!(!Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) ||
        (c == KeyEvent.VK_DELETE))) {
            ch.getToolkit().beep();
            evt.consume();
            return true;
        }
        return false;
    }
    
    
}
