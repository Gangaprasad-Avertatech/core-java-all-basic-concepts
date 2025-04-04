package collection;

import java.util.*;

public class hashset {

	public static void main(String[] args)
	{
		HashSet<String> h1=new HashSet<>();
	
    
    // Add elements
    h1.add("New York");
    h1.add("London");
    h1.add("Tokyo");
    h1.add("New York");  // Duplicate, ignored
    
    // Using Iterator to traverse the HashSet
    Iterator<String> itr = h1.iterator();
    
    while (itr.hasNext()) {
        System.out.println(itr.next());
	}
	}
}


