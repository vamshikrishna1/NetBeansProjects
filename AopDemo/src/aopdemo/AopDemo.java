/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aopdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author vamshi
 */
public class AopDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Resource resource=new FileSystemResource("SpringXmlConfig.xml");
        BeanFactory factry=new XmlBeanFactory(resource);
        Iaccount a=(Iaccount) factry.getBean("accountproxy");
        a.deposit();
        a.withdraw();
        
    }
    
}
