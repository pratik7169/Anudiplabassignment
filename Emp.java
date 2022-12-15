package com.anudip;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="labass")  //table name in sql database


public class Emp {
			
			public int getEid() {
				return eid;       //get of eid
			}
			public void setEid(int eid) {
				this.eid = eid;    // set of  eid
			}
			public String getEname() {
				return ename;    //get of ename
			}
			public void setEname(String ename) {
				this.ename = ename;   //set of ename
			}
			public String getEdept() {
				return edept;     // get of edept
			}
			public void setEdept(String edept) {
				this.edept = edept;   //set of edept
			}
			public int getSalary() {
				return salary;   //get of salary 
			}
			public void setSalary(int salary) {
				this.salary = salary;   //set of salary
			}
			@Id
			private int eid;             //initilize eid
			private String ename;        //initilize ename
			private String edept;        //initilize edept
			private int salary;          //initlize salary
			private EmpAdd address;     //call from EmpAdd class
			public EmpAdd getAddress() {    //get of address
				return address;
			}
			public void setAddress(EmpAdd address) {  //set of address
				this.address = address;
			}
			
	}



