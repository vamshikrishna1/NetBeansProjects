/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kmit;

/**
 *
 * @author vamshi
 */
public class Material {
    
    private String whno;
    private int mcode;
    private String mname;
    private int qoh;
    private int cprice;

    public Material() {
    }

    public String getWhno() {
        return whno;
    }

    public void setWhno(String whno) {
        this.whno = whno;
    }

    public int getMcode() {
        return mcode;
    }

    public void setMcode(int mcode) {
        this.mcode = mcode;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public int getQoh() {
        return qoh;
    }

    public void setQoh(int qoh) {
        this.qoh = qoh;
    }

    public int getCprice() {
        return cprice;
    }

    public void setCprice(int cprice) {
        this.cprice = cprice;
    }
    

}
