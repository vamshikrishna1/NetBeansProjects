/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateexample;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author vamshi
 */
public class Hibernateexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        AnnotationConfiguration config=new AnnotationConfiguration();
        config.addAnnotatedClass(Delegate.class);
        config.addAnnotatedClass(Event.class);
        
        config.configure("hibernate.cfg.xml");
        
        new SchemaExport(config).create(true, true);
        
        
        SessionFactory factory=config.buildSessionFactory();
        Session s=factory.getCurrentSession();
        s.beginTransaction();
        
//        Employee emp=new Employee();
////        emp.setEmpId(12345);
//        emp.setEmpName("krishna");
//        emp.setEmpEmailAddress("v4vamshikrishna@gmail.com");
//        
//Customer customer=new Customer();
//customer.setAddress("HYderbad");
//customer.setCustomerName("vamshi");
//customer.setNumber(9700477143L);
//customer.setSex("Male");

//
//Project p=new Project();
//p.setProjectName("Java");
//
//Module m=new Module();
//m.setModuleName("Advanced Java");
//m.setProjectName("java");
//
//Task t=new Task();
//t.setModuleName("Advanced java");
//t.setProjectName("Java");
//t.setTaskName("HibernateFrameWork");

//s.save(p);
//s.save(m);
//s.save(t);

//PersonDetails pd=new PersonDetails();
//pd.setAddress("Hyderdabad");
//pd.setEmailId("vamshikrishna@gmail.com");
//pd.setGender("Male");
//
//Person p=new Person();
//p.setPersonName("krishna");
////p.setPesondetails(pd);
//
//pd.setPerson(p);

//


Delegate d1=new Delegate();
d1.setDelegateName("vamshi");

Delegate d2=new Delegate();
d2.setDelegateName("Krishna");

Delegate d3=new Delegate();
d3.setDelegateName("Kannayya");


Event e1=new Event();
e1.setEventName("CoreJava");

Event e2=new Event();
e2.setEventName("AdvancedJava");

Event e3=new Event();
e3.setEventName("HibernateFrameWork");


d1.getEventsList().add(e1);
d1.getEventsList().add(e2);

d2.getEventsList().add(e2);
d2.getEventsList().add(e3);

d3.getEventsList().add(e3);
d3.getEventsList().add(e1);




//e1.getDelegateList().add(d1);
//e1.getDelegateList().add(d3);
//
//e2.getDelegateList().add(d1);
//e2.getDelegateList().add(d2);
//
//e3.getDelegateList().add(d2);
//e3.getDelegateList().add(d3);





s.save(d1);
s.save(d2);
s.save(d3);

s.save(e1);
s.save(e2);
s.save(e3);


s.getTransaction().commit();
    }
    
}
