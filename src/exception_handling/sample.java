package exception_handling;

public class sample {

	public static void main(String[] args) 
	{		
		  try 
		  {
			  int[] arr = {1, 2, 3};
		      System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
		  }
		  catch (ArrayIndexOutOfBoundsException e)
		   {
		         System.out.println("Exception: " + e);
		   } 
		  finally 
		   {
		          System.out.println("Finally block executed.");  //finally block always executed
		   }
		

	}

}
