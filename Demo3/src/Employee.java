
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vamshi
 */
public class Employee extends AbstractTableModel {
int count=0;
    String[] sarr=new String[100];
    public Employee() throws FileNotFoundException, IOException{
    
    FileReader fr=new FileReader("EMP.dat");
    BufferedReader br=new BufferedReader(fr);
    
    String s=br.readLine();
    while(s!=null){ 
      
    sarr[count]=s;
    count++;
    s=br.readLine();
    }
    
    }
    
    
    
    
    @Override
    public int getRowCount() {
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    return count; 
    }

    @Override
    public int getColumnCount() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    String rs=sarr[rowIndex];
        
    String arr[]=rs.split(",");
    return arr[columnIndex];
    
    }
    
    public String getColumnName(int Index){
    String cname = null;
    switch(Index){
        case 0:cname= "ENO";
        break;
        case 1:cname="ENAME";
        break;
        case 2:cname="Salary";
        break;
        case 3:cname="Designation";
        break;
            
       
    
    }
    return cname;
    }


}
