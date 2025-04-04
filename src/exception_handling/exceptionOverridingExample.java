package exception_handling;

import java.io.FileNotFoundException;
import java.io.IOException;

class demo
{
    void show() throws IOException 
    {
        System.out.println("Parent method");

    }

}
class clg extends demo
{
	 void show() throws FileNotFoundException
	 {
	        System.out.println("Child method");
	 }
}
public class exceptionOverridingExample
{

	public static void main(String[] args) 
	{
		  demo d1 = new clg();
	        try {
	            d1.show();
	        } 
	        catch (IOException e) 
	        {
	            System.out.println("Exception caught: " + e);
	        }

	}

}
