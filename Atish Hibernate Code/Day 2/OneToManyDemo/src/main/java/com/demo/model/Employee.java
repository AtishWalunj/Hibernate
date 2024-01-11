package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee11")
public class Employee {
	@Id
     private int eid;
     private String uname;
     private double sal;
     @OneToOne()
     @JoinColumn(name="deptno")
     private Department dept;
	
     
	public Employee() {
		super();
	}
	public Employee(int eid, String uname, double sal) {
		super();
		this.eid = eid;
		this.uname = uname;
		this.sal = sal;
	}
	public Employee(int eid, String uname, double sal, Department dept) {
		super();
		this.eid = eid;
		this.uname = uname;
		this.sal = sal;
		this.dept = dept;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", uname=" + uname + ", sal=" + sal + ", dept=" + dept + "]";
	}
     
}
