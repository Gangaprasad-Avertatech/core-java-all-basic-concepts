package collection;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) 
	{
		        ArrayList<String> a1 = new ArrayList<>();

		        // 1. Add elements to the ArrayList
		        a1.add("Apple");
		        a1.add("Banana");
		        a1.add("Orange");
		        a1.add("Mango");


		        // Access elements
		        System.out.println("First Name: " + a1.get(0));  
		        
		        // Loop through the list
		        for (String name : a1) 
		        {
		            System.out.println(name);
		        }
		    
	}

}
