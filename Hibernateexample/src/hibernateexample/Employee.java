/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateexample;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author vamshi
 */
@Entity
@Table(name = "EmployeeInfo")
public class Employee {

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    public String getEmpEmailAddress() {
        return empEmailAddress;
    }

    public void setEmpEmailAddress(String empEmailAddress) {
        this.empEmailAddress = empEmailAddress;
    }

    public boolean isIsPermanent() {
        return isPermanent;
    }

    public void setIsPermanent(boolean isPermanent) {
        this.isPermanent = isPermanent;
    }

    public Date getEmpLoginTime() {
        return empLoginTime;
    }

    public void setEmpLoginTime(Date empLoginTime) {
        this.empLoginTime = empLoginTime;
    }
    
    
    @Id
    @TableGenerator(name="empid",table="emppktb",pkColumnName = "empkkey",pkColumnValue = "empvalue",allocationSize =1)
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "empid")
    @Column(name = "EmployeeId")
    private int empId;
    
    private String empName;
    
    @Transient
    private String empPassword;
    
    @Column(nullable = false)
    private String empEmailAddress;
    
    @Transient
    private boolean isPermanent;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date empLoginTime;

    public Employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    
    
}
