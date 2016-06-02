/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author vamshi
 */
@ManagedBean
@SessionScoped
public class User {
    
    private String name;
    private String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
public void check(){
if(name.equals("vamshi")){

msg="Valid User,Access Granted";
}else{
msg="Invalid user,Please try Again";
}

}



}
