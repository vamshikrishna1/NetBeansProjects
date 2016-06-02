/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kmit;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author vamshi
 */
public class MaterialTableModel extends AbstractTableModel {

    List<Material> l=null;
    public MaterialTableModel(String wname) {
    Session session=HibernateUtil.getSessionFactory().getCurrentSession();
    session.beginTransaction();
    Query q=session.createQuery("from Material where whno='"+wname+"'");
    System.out.println("in constructor before query execution");
    l=new ArrayList<Material>(q.list());
    session.close();
    System.out.println("in constructor");
    }

    @Override
    public int getRowCount() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return l.size();
    }

    @Override
    public int getColumnCount() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    switch(columnIndex+1){
    case 1:return l.get(rowIndex).getWhno();
    
    case 2:return l.get(rowIndex).getMcode();
    case 3:return l.get(rowIndex).getMname();
    case 4:return l.get(rowIndex).getQoh();
    case 5:return l.get(rowIndex).getCprice();
    
    }
    return -1;
    }

    @Override
    public String getColumnName(int column) {
//        return super.getColumnName(column); //To change body of generated methods, choose Tools | Templates.
String col=null;    
switch(column){
    case 0:col="Whno";break;
    case 1:col="MCode";break;
    case 2:col="Mname";break;
    case 3:col="Quantity";break;
    case 4:col="CostPrice";break;
    
    
    }
    return col; 
    
    }
   
    
    
    
}
