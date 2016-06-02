/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatestudentdemo;

import java.io.Serializable;

/**
 *
 * @author vamshi
 */

public class Student  {
    
    private int htno;
    private String name;
    private int maths;
    private int physics;
    private int chemistry;
    

    public int getHtno() {
        return htno;
    }

    public Student() {
    }

    public void setHtno(int htno) {
        this.htno = htno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }
    
}
