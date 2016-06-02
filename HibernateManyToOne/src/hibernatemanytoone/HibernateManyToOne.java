/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatemanytoone;

import org.hibernate.Session;

/**
 *
 * @author vamshi
 */
public class HibernateManyToOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Session s=NewHibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Address addr=new Address();
        addr.setCity("Hyderabad");
        addr.setStreet("Chikkadpally");
        s.save(addr);
        Person p1=new Person();
        p1.setName("vamshi");
        p1.setSalary(24503);
        p1.setAddr(addr);
        Person p2=new Person();
        p2.setName("Krishna");
        p2.setSalary(25000);
        p2.setAddr(addr);
        s.save(p1);
        s.save(p2);
        s.getTransaction().commit();
    }
    
}
