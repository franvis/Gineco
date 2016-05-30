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
            setForeground(table.getSelectionForeground());  
            setBackground(table.getSelectionBackground());  
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
        if(value!= null && value.toString().length()>30){
            int height_wanted = (int)getPreferredSize().getHeight();
            if (height_wanted != table.getRowHeight(row))
                table.setRowHeight(row, height_wanted);
        }
        setText((value == null) ? "" : value.toString()); 
        return this;
    } 
    
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(40, 30);
    }
}
