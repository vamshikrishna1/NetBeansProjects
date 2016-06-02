/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aopdemo;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

/**
 *
 * @author vamshi
 */
public class After implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object o, Method method, Object[] os, Object o1) throws Throwable {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    System.out.println("Farewell From kmitt");
    System.out.println("After returning Method"+method.getName());
    }
    
}
