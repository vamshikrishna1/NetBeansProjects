/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vamshi
 */
public class StudentDetails extends AbstractTableModel {

    int Records=0;
    String sarr[]=new String[100];

    
     StudentDetails(String fname ) throws FileNotFoundException, IOException{
    Records=0;
    FileReader fr=new FileReader(fname);
    BufferedReader br=new BufferedReader(fr);
    
    String student=br.readLine();
   while(student!=null){
   
   sarr[Records]=student;
   Records++;

   student=br.readLine();
   }
    
    
    
    
    }
    
    
    
    @Override
    public int getRowCount() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    return Records;
    
    }

    @Override
    public int getColumnCount() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String student=sarr[rowIndex];
String s[]=student.split(",");
    
    return s[columnIndex];
    }

public String getColumnName(int column){

String cname=null;
    switch(column){
        case 0:cname="StudentId";
        break;
        
        case 1:cname="StudentName";
        break;
        
        case 2:cname="Gender";
        break;
        
        case 3:cname="MobileNo";
        break;
        


}

return cname;
}


}
