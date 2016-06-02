/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;





/**
 *
 * @author vamshi
 */
@Named
@ApplicationScoped
public class DataBean implements Serializable {


@Inject
Employee employee;

@Inject
Employee employe2;

private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

private String role;

private List<Employee> empList;    

public DataBean(){
}

    public DataBean(Employee employee) {
        this.employee = employee;
    }

@PostConstruct
public void  prepare(){
empList=new ArrayList<Employee>();
System.out.println("I am in Constructor");
employee.setName("vamshi");
employee.setRole("Developer");
empList.add(employee);
System.out.println("++++++++++++++++++++++++++++++"+empList.size());
employe2.setName("Krishna");
employe2.setRole("Senior Developer");
empList.add(employe2);
    
    System.out.println("I am in postConstruct");

    
    
}

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

public void removeEmployee(Employee emp){

empList.remove(emp);

}

public void newEmployee(){

Employee emp=new Employee();
emp.setName(name);
emp.setRole(role);
empList.add(emp);
}

}
