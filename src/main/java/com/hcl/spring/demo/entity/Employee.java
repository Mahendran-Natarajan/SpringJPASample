package com.hcl.spring.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "EMP_ID")
    private Long empId;
    @Column(name = "EMP_NAME")
    private String empName;

    public Employee() {
        super();
    }

    @Column(name = "DESIGNATION")
    private String designation;
    @Column(name = "BASIC_SALARY")
    private double basicSalary;

    public Employee(Long empId, String empName, String designation, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.basicSalary = basicSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", designation='" + designation + '\'' +
                ", basicSalary=" + basicSalary +
                '}';
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
}
