/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclientdemo;

import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author vamshi
 */
public class Arithmetic extends DefaultTableModel {

    @Override
    public int getRowCount() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return 2;
    }

    @Override
    public int getColumnCount() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    String cname=null;
    switch(columnIndex){
        case 0:cname="OPERATION";
        break;
        case 1:cname="Result";
        break;
    
    }
    
    return cname;
    }

    

    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    
//       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if(columnIndex==0){
     if(rowIndex==0) return "ADDITION";
    if(rowIndex==1) return "SUBTRACTION";
    
    }
   if(columnIndex==1){
       
       if(rowIndex==0) return CalculatorUI.c ;
    if(rowIndex==1) return CalculatorUI.d;
   
   }
    return null;
    }

    
    
}
