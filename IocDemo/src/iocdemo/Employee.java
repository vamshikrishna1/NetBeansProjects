/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iocdemo;

/**
 *
 * @author vamshi
 */
public class Employee {
    
private String name;
private Integer age;
private Float salary;
private Address addr;

    public Employee(String name, Integer age, Float salary, Address addr) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }


    
    
}
