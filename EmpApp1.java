package com.anudip;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpApp1 {                        //class started
	public static void main(String[] args) {  //main method
		// TODO Auto-generated method stub
		Configuration con=new Configuration().configure().addAnnotatedClass(Emp.class); //configuration of emp class
	       SessionFactory sf=con.buildSessionFactory();   
	    	Session ss=sf.openSession();
	    	Transaction T=ss.beginTransaction();
	    	Emp e1=new Emp();    //to add in emp table abt emp details
	    	e1.setEid(101);
	    	e1.setEname("pratik");
	    	e1.setEdept("manager");
	    	e1.setSalary(35000);
	    	EmpAdd a1=new EmpAdd();  // to add in address 
	    	a1.setHname("rajniwas");
	    	a1.setArea("pune");
	    	a1.setPincode(410405);
	    	e1.setAddress(a1);
	    	ss.save(e1);           //to save 1st entry or detail
	    	Emp e2=new Emp();     //to add in emp table 
	    	e2.setEid(102);
	    	e2.setEname("deepali");
	    	e2.setEdept("packing");
	    	e2.setSalary(25000);
	    	EmpAdd a2=new EmpAdd();    // to add in address 
	    	a2.setHname("aashirwad");
	    	a2.setArea("dange chowk");
	    	a2.setPincode(411233);
	    	e2.setAddress(a2);           //to save 2nd entry or detail
	    	ss.save(e2);
	    	Emp e3=new Emp();        //to add in emp table 
	    	e3.setEid(103);
	    	e3.setEname("sonya");
	    	e3.setEdept("driving");
	    	e3.setSalary(15000);
	    	EmpAdd a3=new EmpAdd();    // to add in address 
	    	a3.setHname("house of joy");
	    	a3.setArea("sahara colony");
	    	a3.setPincode(415647);
	    	e3.setAddress(a2);
	    	ss.save(e3);            //to save 3rd entry or detail
	    	Emp e4=new Emp();    //to add in emp table 
	    	e4.setEid(104);
	    	e4.setEname("sanket");
	    	e4.setEdept("opreator");
	    	e4.setSalary(20000);
	    	EmpAdd a4=new EmpAdd();    // to add in address 
	    	a4.setHname("swarg");
	    	a4.setArea("sangali");
	    	a4.setPincode(477363);
	    	e4.setAddress(a4);          
	    	ss.save(e4);            //to save 4th entry or detail
	    	Emp e5=new Emp();     //to add in emp table 
	    	e5.setEid(105);
	    	e5.setEname("sam");
	    	e5.setEdept("account");
	    	e5.setSalary(35000);
	    	EmpAdd a5=new EmpAdd();   // to add in address 
	    	a5.setHname("rajmahal");
	    	a5.setArea("lonavla");
	    	a5.setPincode(411223);
	    	e5.setAddress(a5);
	    	ss.save(e5);          //to save 5th entry or detail
	    	T.commit();
	    	System.out.println("table created");   //print statement

	}  // main method ended

}   //class ended


