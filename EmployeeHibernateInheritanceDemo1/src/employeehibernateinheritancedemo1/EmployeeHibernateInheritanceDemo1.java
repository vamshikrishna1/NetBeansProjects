/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeehibernateinheritancedemo1;

import org.hibernate.Session;

/**
 *
 * @author vamshi
 */
public class EmployeeHibernateInheritanceDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Session s=HibernateUtil.getSessionFactory().getCurrentSession();
    s.beginTransaction();
    RegularEmployee re=new RegularEmployee();
    re.setAge(24);
    re.setName("vamshi");
    re.setSalary(25000);
    s.save(re);
    ContractEmployee ce=new ContractEmployee();
    ce.setAge(26);
    ce.setHoursWorked(40);
    ce.setHrate(1000);
    ce.setName("krishna");
    s.save(ce);
    s.getTransaction().commit();
    
    }
    
}
