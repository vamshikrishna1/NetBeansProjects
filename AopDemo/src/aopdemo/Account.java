/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aopdemo;

/**
 *
 * @author vamshi
 */
public class Account implements Iaccount {

    @Override
    public void withdraw() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("Withdraw called");
    
    }

    @Override
    public void deposit() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("Deposit Called");
    }
    
}
