package ClasesBase;

import GUI.EleccionColor;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 * Clase para el manejo de los colores de ventana
 * @author Denise
 */
public class GestorEstilos {
    
    public static int colorActual = 0;
    
    /* 0 - Por defecto
     * 1 - Rosa pálido
     * 2 - Rosa viejo
     * 3 - Verde
     * 4 - Amarillo
     * 5 - Azul
     * 6 - Lila
     */
    
    /**
     * Obtiene el color primario en la paleta de colores a usar
     * @param color int El código representativo de la paleta de colores a usar
     * @return Color El color primario para la paleta en cuestión
     */
    public static Color getColorPrimario(int color)
    {
        int a, b, c;
        switch (color){
            case 0:
                a = 240; b = 240; c=240;
                break;
            case 1:
                a = 255; b = 204; c=204;
                break;
             case 2:
                a = 250; b = 174; c=174;
                break; 
             case 3:
                a = 179; b = 225; c=194;
                break;
             case 4:
                a = 255; b = 252; c=204;
                break;
             case 5:
                a = 225; b = 225; c=254;
                break;
             case 6:
                a = 240; b = 208; c=248;
                break;
             default:
                a = 240; b = 240; c=240;
        }
        return new Color(a, b, c);
    }
    
    /**
     * Obtiene el color secundario en la paleta de colores a usar
     * @param color int - El código representativo de la paleta de colores a usar
     * @return Color - El color secundario para la paleta en cuestión
     */
    public static Color getColorSecundario(int color)
    {
        int a, b, c;
        switch (color){
            case 0:
                a = 228; b = 228; c = 241;
                break;
            case 1:
                a = 235; b = 197; c = 218;
                break;
             case 2:
                a = 255; b = 204; c=204;
                break; 
             case 3:
                a = 176; b = 205; c=186;
                break;
             case 4:
                a = 253; b = 222; c=160;
                break;
             case 5:
                a = 204; b = 204; c=255;
                break;
             case 6:
                a = 232; b = 190; c=245;
                break;
             default:
                a = 255; b = 240; c=240;
        }
        return new Color(a, b, c);
    }
    
    /**
     * Obtiene el color terciario en la paleta de colores a usar
     * @param color int - El código representativo de la paleta de colores a usar
     * @return Color - El color secundario para la paleta en cuestión
     */
    public static Color getColorTerciario(int color)
    {
        int a, b, c;
        switch (color){
            case 0:
                a = 255; b = 255; c = 255;
                break;
            case 1:
                a = 250; b = 230; c = 250;
                break;
             case 2:
                a = 250; b = 230; c = 250;
                break; 
             case 3:
                a = 220; b = 240; c = 240;
                break;
             case 4:
                a = 249; b = 249; c = 222;
                break;
             case 5:
                a = 229; b = 229; c = 250;
                break;
             case 6:
                a = 244; b = 224; c = 244;
                break;
             default:
                a = 240; b = 240; c=240;
        }
        return new Color(a, b, c);
    }
    
    /**
     * Obtiene el color de texto en la paleta de colores a usar
     * @param color int - El código representativo de la paleta de colores a usar
     * @return Color - El color secundario para la paleta en cuestión
     */
    public static Color getColorTexto(int color)
    {
        int a, b, c;
        switch (color){
            case 0:
                a = 0; b = 0; c = 0;
                break;
            case 1:
                a = 57; b = 4; c = 4;
                break;
             case 2:
                a = 57; b = 4; c = 4;
                break; 
             case 3:
                a = 0; b = 51; c = 51;
                break;
             case 4:
                a = 91; b = 41; c = 2;
                break;
             case 5:
                a = 0; b = 51; c = 102;
                break;
             case 6:
                a = 61; b = 1; c = 61;
                break;
             default:
                a = 0; b = 0; c = 0;
        }
        return new Color(a, b, c);
    }
    
    /**
     * Pinta un objeto contenedor según el código de paleta guardado en el archivo auxiliar
     * @param c Container a pintar
     */
    public static void pintar(Container c)
    {
        try {
            colorActual = ManejoArchivos.leerColor();
        }
        catch (Exception e) {}
        pintarComponentes(c);
    }   
    
    /**
     * Pinta los componentes pertenecientes a un objeto Container
     * @param parent Container - El contenedor a pintar
     * @param colorPrimario Color primario
     * @param colorSecundario Color secundario
     */
    public static void pintarComponentes(Container parent)
    {
        if (parent instanceof EleccionColor)
        {
            pintarComponentes(parent.getParent());
            ((GUI.Principal) parent.getParent()).pintarHijos();
        }
        
        for (Component componente : parent.getComponents())
        {
            if (componente instanceof JRadioButton)
                break;
            
            //Seteo de background
            if (componente instanceof JTextArea || componente instanceof JTextField)
                componente.setBackground(getColorTerciario(colorActual));
            else if (componente instanceof JButton)
                componente.setBackground(getColorSecundario(colorActual));
            else if (componente instanceof JTable)
                componente.setBackground(getColorTerciario(colorActual));
            else 
                componente.setBackground(getColorPrimario(colorActual));
            
            //Seteo de fuente
            if (componente instanceof JButton && componente.isEnabled())
                componente.setForeground(getColorTexto(colorActual));
            
            //Seteo de títulos en bordes de paneles
            if (componente instanceof JPanel) {
                JPanel comp = (JPanel)componente;
                if (comp.getBorder() instanceof TitledBorder) {
                    String texto = ((TitledBorder)comp.getBorder()).getTitle();
                    comp.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), texto, javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), getColorTexto(colorActual)));
                }
            }
            
            if (componente instanceof Container || componente instanceof JPanel)
                pintarComponentes((Container)componente);
        }
    }
}
