/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateexample2;

import java.util.List;
import javax.security.auth.login.Configuration;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author vamshi
 */
public class HibernateExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AnnotationConfiguration config=new AnnotationConfiguration();
        config.addAnnotatedClass(UserDetails.class);
//        config.addAnnotatedClass(Event.class);
        
        config.configure("hibernate.cfg.xml");
        
//        new SchemaExport(config).create(true, true);
        
    
    SessionFactory factory=config.buildSessionFactory();
        Session session=factory.getCurrentSession();
        session.beginTransaction();
//      UserDetails userDetails;  
      UserDetails userDetails=(UserDetails) session.get(UserDetails.class, 1);
//      System.out.println(userDetails.getUserName());
//    for(int i=1;i<=10;i++){
//    userDetails=new UserDetails();
//    userDetails.setUserName("User"+i);
//    session.save(userDetails);
//    
//    }

//

//Query q=session.createQuery("from UserDetails");
//q.setFirstResult(10);
//q.setMaxResults(2);
//Criteria criteria=session.createCriteria(UserDetails.class).setProjection(Projections.max("userId")).addOrder(Order.asc(propertyName));



//criteria.add(Restrictions.eq("userName", "krishna"));


//List<String> users=criteria.list();



session.getTransaction().commit();
//    for(String u:users)
//System.out.println(u);
    }
    
}
