package exception_handling;

public class FinalizeEXP 
{
	protected void finalize() throws Throwable
	{
        System.out.println("Object is being garbage collected.");
    }

	public static void main(String[] args)
	{
		 
		   FinalizeEXP obj = new FinalizeEXP();
		   obj = null;
		   System.gc();  // Request garbage collection
		    
		}


	}

}
