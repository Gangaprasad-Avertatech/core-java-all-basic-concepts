package String;

public class Builder {

	public static void main(String[] args) 
	{
		StringBuilder b1=new StringBuilder("java");
		
		b1.append(" Programming");
		System.out.println(b1);
		
		
		 b1.insert(5, " Beautiful " );
	     System.out.println(b1);
	     

	     b1.delete(5, 15);
	     System.out.println(b1);  // Hello World

	     b1.reverse();
	     System.out.println(b1);  // dlroW olleH

	}

}
