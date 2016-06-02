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
public class RegularEmployee extends Employee {
    private int salary;

    public RegularEmployee() {
        
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
