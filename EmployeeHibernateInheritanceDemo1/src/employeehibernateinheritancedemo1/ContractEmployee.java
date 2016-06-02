/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeehibernateinheritancedemo1;

/**
 *
 * @author vamshi
 */
public class ContractEmployee extends Employee {
    private int hrate;
    private int hoursWorked;

    public ContractEmployee() {
    }

    public int getHrate() {
        return hrate;
    }

    public void setHrate(int hrate) {
        this.hrate = hrate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    
}
