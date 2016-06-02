/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateexample;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author vamshi
 */
@Entity
public class Person {
    
    @Id
    @GeneratedValue
    private int personId;
    private String personName;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "PersonDetails_FK")
    private PersonDetails pesondetails;

    public PersonDetails getPesondetails() {
        return pesondetails;
    }

    public void setPesondetails(PersonDetails pesondetails) {
        this.pesondetails = pesondetails;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
    


}
