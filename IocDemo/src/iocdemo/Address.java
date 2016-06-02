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
public class Address {
    
    private String street;
    private String city;
    private String State;

    public Address(String street, String city, String State) {
        this.street = street;
        this.city = city;
        this.State = State;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }
    
    
    
}
