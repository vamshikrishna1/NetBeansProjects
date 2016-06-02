/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatefiledemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;

/**
 *
 * @author vamshi
 */
public class HibernateFileDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Student student=new Student();
            Session session;
            
            
            FileReader fr=new FileReader("Students.txt");
            BufferedReader br=new BufferedReader(fr);
            
            String text=br.readLine();
            
            while(text!=null){
                session=NewHibernateUtil.getSessionFactory().getCurrentSession();
                session.beginTransaction();        
                String[] s=text.split(",");
                System.out.println(s[0]+" "+s[1]+" "+s[2]+" "+s[3]);
                student.setName(s[0]);
                student.setMaths(Integer.parseInt(s[1]));
            student.setPhysics(Integer.parseInt(s[2]));
            student.setChemistry(Integer.parseInt(s[3]));
            session.save(student);
            session.getTransaction().commit();
            text=br.readLine();
            }
            
            
//            session.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HibernateFileDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HibernateFileDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
