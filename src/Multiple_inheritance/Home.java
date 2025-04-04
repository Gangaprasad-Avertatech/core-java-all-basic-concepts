package Multiple_inheritance;

public class Home implements one, two, three
{

	@Override
	public void get() 
	{
		System.out.println("hi");
	}

	@Override
	public void disp() 
	{
		System.out.println("hello");
	}

	@Override
	public void show() 
	{
		System.out.println("welcome");		
	}
	
	public static void main(String[] args) 
	{	
		Home h1 = new Home();
		h1.get();
		h1.show();
		h1.disp();
		
	}


}
