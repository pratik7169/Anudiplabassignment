package com.anudip;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	

    	// Save the teacher and course to the database
    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Teacher.class);
		Configuration cfg1=new Configuration().configure().addAnnotatedClass(Course.class);
		
		SessionFactory sf=cfg.buildSessionFactory();  // build session factory
		Session ss=sf.openSession();  // open session
		Transaction t=ss.beginTransaction(); //  start transaction
		// Create a new teacher
    	Teacher t1= new Teacher();
    	t1.setName("Mrunali");

    	// Create a new course and set the teacher
    	Course c1 = new Course();
    	c1.setName("Java programming");
    	c1.setTeacher(t1);
    	ss.save(c1);
    	Course c2 = new Course();
    	c2.setName("Python programming");
    	c2.setTeacher(t1);
    	ss.save(c2);
    	Course c3 = new Course();
    	c3.setName("Angular programming");
    	c3.setTeacher(t1);
    	ss.save(c3);
    	
    
    	ss.save(t1);
    	ss.close();
    	//t.commit();
    	System.out.println("one to many ");



    }
}
