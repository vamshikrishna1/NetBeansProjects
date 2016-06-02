/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatedemo;

/**
 *
 * @author vamshi
 */
public class Employee {
    private int empno;
    private String ename;
    private int salary;
    private int deptno;
    private String designation;

    public int getEmpno() {
        return empno;
    }

    public Employee() {
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEname() {
        return ename;
    }

    public int getSalary() {
        return salary;
    }

    public int getDeptno() {
        return deptno;
    }

    public String getDesignation() {
        return designation;
    }
    
    
}
