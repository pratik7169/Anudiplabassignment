package lab5;

public class changeCase {
  public static void main(String[] args) {
	  String s="HEllo";
      StringBuffer newStr=new StringBuffer(s);    
       
       for(int i = 0; i < s.length(); i++) {   
    	   //check for lowercase
    	   if(Character.isLowerCase(s.charAt(i))) { 
    		   //convert lower to upper
    		   newStr.setCharAt(i, Character.toUpperCase(s.charAt(i)));    
    		      }
    	   //check for uppercase
    	   else if(Character.isUpperCase(s.charAt(i))) {    
    		   //convert upper to lower
       
               newStr.setCharAt(i, Character.toLowerCase(s.charAt(i)));    
       }
	}
       System.out.println("String is : " + newStr);    

}
}
