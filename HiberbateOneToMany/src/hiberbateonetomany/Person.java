/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiberbateonetomany;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author vamshi
 */
public class Person {
    private int pid;
    private String name;
    private int sal;
    private Set<Location> lset=new HashSet<Location>(); 

    public Person() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public Set<Location> getLset() {
        return lset;
    }

    public void setLset(Set<Location> lset) {
        this.lset = lset;
    }
    
}
