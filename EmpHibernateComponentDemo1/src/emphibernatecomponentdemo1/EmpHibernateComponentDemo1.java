/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emphibernatecomponentdemo1;

import org.hibernate.Session;

/**
 *
 * @author vamshi
 */
public class EmpHibernateComponentDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Session s=HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Employee emp=new Employee();
        emp.setName("vamshi");
        emp.setId(1);
        emp.setAge(24);
        Address addr=new Address();
        addr.setCity("HYderabad");
        addr.setState("Telangana");
        addr.setStreet("Chikkadpally");
        addr.setHouseno("1-8-1/51");
        emp.setAddr(addr);
        s.save(emp);
        s.getTransaction().commit();
    }
    
}
