/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateexample;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author vamshi
 */
@Entity
public class Event {
    @Id
    @GeneratedValue
    private int eventId;
    private String eventName;
    @ManyToMany
    @JoinTable(name = "Join_Event_Delegate",joinColumns = {@JoinColumn(name="eventId")},inverseJoinColumns = {@JoinColumn(name="delegateId")})
    private List<Delegate> delegateList=new ArrayList<Delegate>() ;

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public List<Delegate> getDelegateList() {
        return delegateList;
    }

    public void setDelegateList(List<Delegate> delegateList) {
        this.delegateList = delegateList;
    }
    
    
}
