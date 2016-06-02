/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclientdemo;

/**
 *
 * @author vamshi
 */
public class JavaClientDemo {

    /**
     * @param args the command line arguments
     */
    public static int add(int i, int j) {
        com.kmit.CalculatorWS_Service service = new com.kmit.CalculatorWS_Service();
        com.kmit.CalculatorWS port = service.getCalculatorWSPort();
        return port.add(i, j);
    }

    public static int subtract(int i, int j) {
        com.kmit.CalculatorWS_Service service = new com.kmit.CalculatorWS_Service();
        com.kmit.CalculatorWS port = service.getCalculatorWSPort();
        return port.subtract(i, j);
    }
    
    
    
    
    

    
    
}
