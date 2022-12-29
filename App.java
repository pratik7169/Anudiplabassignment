package com.anudip.SpringAgent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App // create class
{
 private static ApplicationContext ap;

public static void main( String[] args )


{
	  ap = new ClassPathXmlApplicationContext("config.xml");
      AgentDao Dao=(AgentDao)ap.getBean("e");
      
      // Insert
      //1st Entry
     System.out.println(Dao.saveAgent(new Agent(1,"pratik",54000))); //save method call
      //2nd Entry
     System.out.println(Dao.saveAgent(new Agent(2,"deepali",74000))); //save method call
      //3rd Entry
     System.out.println(Dao.saveAgent(new Agent(3,"Monya",84000))); //save method call
      
      // update
      //System.out.println(Dao.updateAgent(new Agent(1,"pratik",65000)));// update method call
      
      //Delete
      //System.out.println(Dao.deleteAgent(new Agent(3)));// delete method call
      
      
     

         
       
    }
}