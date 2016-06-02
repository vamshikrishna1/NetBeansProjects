
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vamshi
 */
public class MyRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if(column==2){
    String v=(String)value;
    int sv=Integer.parseInt(v);
    if(sv>60000){
    JLabel j=new JLabel(v);
    j.setForeground(Color.red);
    
    return j;
    }
    
    }
    
        JLabel j=new JLabel((String)value);
    return j;
    
    
    
    }
    
}
