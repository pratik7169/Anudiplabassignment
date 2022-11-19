package lab6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Agent implements Comparable<Agent>
{
	private String name;
	private int id;
	private String area;

	public String getName()  //get method
	{
		return name;
	}

	public void setName(String name) // set method
	{
		this.name = name;
	}

	public int getId() // get method
	{
		return id;
	}

	public void setId(int id)  // set method
	{
		this.id = id;
	}

	public String getArea() // get method
	{
		return area;
	}

	public void setArea(String area) // set method
	{
		this.area = area;
	}
	
	//Parameterized constructor
	public Agent(String name, int id, String area) 
	{
		super();
		this.name = name;
		this.id = id;
		this.area = area;
	}

	@Override
	public int compareTo(Agent o) // method
	{
		// TODO Auto-generated method stub
		return 
				area.compareToIgnoreCase(o.area);
	}
	
}

public class ComparableIntereface {
	

		public static void main(String[] args) 
		{
			List<Agent>d =new ArrayList<>(); // 
			d.add(new Agent("Pratik",105,"Kamshet")); // using add method
			d.add(new Agent("Deepali",104,"Hinjewadi"));
			d.add(new Agent("Anam",101,"Nigdi"));
			d.add(new Agent("Sanket",103,"Pune"));
			d.add(new Agent ("Sonya",102,"Mirzapalli"));
			
			//sort area wise
			Collections.sort(d);
			for(Agent a:d)  // for each loop
			{
				System.err.println("Agent name :-"+a.getName()+", ID :-"+a.getId()+", Area :-"+a.getArea());
			}
			
		}

	}


