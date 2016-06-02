/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateexample;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author vamshi
 */
@Entity
public class PersonDetails {
    @Id
    @GeneratedValue
    private int personDetailsId;
    private String address;
    private String gender;
    private String emailId;
    @OneToOne(mappedBy = "pesondetails",cascade = CascadeType.ALL)
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public int getPersonDetailsId() {
        return personDetailsId;
    }

    public void setPersonDetailsId(int personDetailsId) {
        this.personDetailsId = personDetailsId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    
}
