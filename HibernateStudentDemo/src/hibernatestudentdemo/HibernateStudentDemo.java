/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatestudentdemo;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author vamshi
 */
public class HibernateStudentDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Session s=hibernatestudentdemo.HibernateUtil.getSessionFactory().getCurrentSession();
    s.beginTransaction();
    Query q=s.createQuery("from Student");
    List<Student> l=new ArrayList<Student>(q.list());
    for(Student stu:l){
//        stu.setMaths(stu.getMaths()+10);
//        s.save(stu);
//    System.out.println(stu.getName());
    if(stu.getMaths()<50){
    s.delete(stu);
    }
    
    }

//List l=q.list();
//System.out.println(l.get(0));

//Student s1=new Student();
//s1.setName("kannayya");
//s1.setMaths(70);
//s1.setPhysics(80);
//s1.setChemistry(90);

//s.save(s1);
s.getTransaction().commit();
//    s.close();
    }
    
}
