/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iocdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author vamshi
 */
public class IocDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Resource xmlresource=new FileSystemResource("SpringXMLConfig.xml");
        BeanFactory factory=new XmlBeanFactory(xmlresource);
        Employee emp=(Employee) factory.getBean("employee");
        System.out.println(emp.getAddr().getState());
    }
    
}
