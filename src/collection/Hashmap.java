package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) 
	{
		 HashMap<Integer, String> h1 = new HashMap<>();

	        // Adding key-value pairs to the HashMap
	        h1.put(1, "John");
	        h1.put(2, "Alice");
	        h1.put(3, "Bob");
	        h1.put(4, "David");

	        // Getting an iterator for the entrySet (key-value pairs)
	        Iterator<Map.Entry<Integer, String>> itr = h1.entrySet().iterator();
	        
	        while (itr.hasNext()) // Iterating through the HashMap using Iterator

	        {	            
	            Map.Entry<Integer, String> entry = itr.next(); // Get each entry (key-value pair)
	            
	          
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	}

}
