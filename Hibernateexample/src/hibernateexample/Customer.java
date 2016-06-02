/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateexample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

/**
 *
 * @author vamshi
 */
@Entity
@Table(name = "Customer")
@SecondaryTable(name = "CustomerDetails")
public class Customer {

    @Id
    @GeneratedValue
    private int customerId;
    @Column(nullable = false)
    private String customerName;
    @Column(table = "CustomerDetails")
    
    private String address;
    @Column(table = "CustomerDetails")
    private String sex;
    @Column(table = "CustomerDetails")
    private long number;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    
}
