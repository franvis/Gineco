/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesBase;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellRenderer;

public class MultiLineCellRenderer extends JTextArea implements TableCellRenderer
{
    public MultiLineCellRenderer() {  
        setLineWrap(true);  
        setWrapStyleWord(true);  
        setOpaque(true);  
        setEditable(false);
    }  
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setFont(table.getFont());
        if (isSelected) {  
            setForeground(new java.awt.Color(0,0,0));  
            setBackground(new java.awt.Color(204,204,255));  
        }  
        else {  
            setForeground(table.getForeground());  
            setBackground(table.getBackground());  
        }  
        if (hasFocus) {  
            setBorder(UIManager.getBorder("Table.focusCellHighlightBorder"));  
            if (table.isCellEditable(row, column)) {  
                setForeground(UIManager.getColor("Table.focusCellForeground"));  
                setBackground(UIManager.getColor("Table.focusCellBackground"));  
            }  
        }  
        else {  
            setBorder(new EmptyBorder(1, 2, 1, 2));  
        }
        setEditable(false);
     
        int alturaDeseada = (int)getPreferredSize().getHeight();
        if(value!= null && value.toString().length()>26 && value.toString().length()<50){
            if (alturaDeseada != table.getRowHeight(row))
                table.setRowHeight(row, alturaDeseada*2);
        }
        else
            if(value!= null && value.toString().length()>=50 && value.toString().length()<75){
                if (alturaDeseada * 2 != table.getRowHeight(row))
                    table.setRowHeight(row, alturaDeseada * 2);
            }
            else
                if(value!= null && value.toString().length()>=75 && value.toString().length()<100){
                    if (alturaDeseada * 3 != table.getRowHeight(row))
                        table.setRowHeight(row, alturaDeseada * 3);
                }
                else
                    if(value!= null && value.toString().length()>=100 && value.toString().length()<125){
                        if (alturaDeseada  * 4 != table.getRowHeight(row))
                            table.setRowHeight(row, alturaDeseada  * 4);
                    }
                    else
                        if(value!= null && value.toString().length()>=125){
                            if (alturaDeseada * 5 != table.getRowHeight(row))
                                table.setRowHeight(row, alturaDeseada  * 5);
                        }
        setText((value == null) ? "" : value.toString()); 
        return this;
    } 
    
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(40, 17);
    }
}
