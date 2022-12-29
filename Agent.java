package com.anudip.SpringAgent;



public class Agent  // create class
{
	private int id;
	private String name;
	private int salary;
	
	
	
	public Agent(int id)
	{
		
		this.id = id;
	}

	public Agent() // Default constructor
	{
		
	}

	public Agent(int id, String name, int salary) // parameterized constructor
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//use Getter Setter Method

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
