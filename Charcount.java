package lab9;

import java.util.HashMap;

public class Charcount {
	 public static void main(String[] args) {
		    char[] arr = {'a', 'c', 'd', 'f', 'a'};
		    
		    // Create a HashMap to store the character counts
		    HashMap<Character, Integer> charCounts = new HashMap<>();
		    
		 // Iterate through the array and count the occurrences of each character
		    for (char p : arr) {
		      int count = charCounts.getOrDefault(p, 0);
		      charCounts.put(p, count + 1);
		    }
		    // Print the character counts
		    for (char p : charCounts.keySet()) {
		      System.out.println(p + ": " +charCounts.get(p));
		    }
		  }
		
		    
		    
		    
	 }


