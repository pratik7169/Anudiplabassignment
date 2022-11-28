package lab7;
import java.util.Arrays;
import java.util.List;
	  
	class MaxMinMark{
	  
	 
	    public static void main(String[] args)
	    {
	  
	        // Creating a list of integers
	       
	        List<Integer> stud= Arrays.asList(89,70,90,23,4);
			
	        // Using stream.min() to get minimum
	        
	        // element according to provided Integer Comparator
	        Integer I = stud.stream().min(Integer::compare).get();
             // Using stream.max() to get maximum
	        
	        // element according to provided Integer Comparator
	        Integer J = stud.stream().max(Integer::compare).get();
	       
	    	   System.out.println(I);
	          System.out.println(J);
	       
	    }
	}

