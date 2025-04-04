package SuperKeyword;

class demo
{
	public demo()
	{
		System.out.println("Super constructor");

	}
}
class sample extends demo
{
	public sample()
	{
		super();      //super    invoke the parent class constructor
		System.out.println("sub class constructor");
	}
	
}
public class constructor {

	public static void main(String[] args) 
	{
		sample s1=new sample();
		
	}

}
