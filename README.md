# Anudiplabassignment
package lab7;

import java.util.ArrayList;
import java.util.List;

class Student
{
	private int id;//id declare
	private String name;//student name declare
	private int age;//age declare
	private float mathsMarks;//marks of maths declare

	public int getId()
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}             //getter setter method of id
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}         //getter setter method of name
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age= age;
	}                 //getter setter method of age
	
	public float getMarks() {
		return mathsMarks;
	}
	public void setMarks(float marks)
	{
		mathsMarks = marks;
}        // getter setter method of marks
	public Student()
	{
		
	}
	public Student(int id, String name,int age, float marks)
	{
		super(); 
		this.id = id;
		this.name = name;
		this.age =  age;
		mathsMarks = marks;
	}
}

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stud=new ArrayList<>();
		stud.add(new Student(1,"pratik",20,77));
		stud.add(new Student(2,"deepali",21,80));
		stud.add(new Student(3,"sonya",23,40));
		stud.add(new Student(4,"sam",22,50));
		stud.add(new Student(5,"sanket",26,75));
		
		stud.stream().filter(s->s.getMarks()>=60).forEach(p-> System.out.println(p.getId()+" "+p.getName()+" "+p.getAge()+" "+p.getMarks()));
		Long counter=stud.stream().filter(s->s.getMarks()>60).count();
		System.out.println("count the Total Student to get More than 75 marks :"+counter);
		
	}

	}

