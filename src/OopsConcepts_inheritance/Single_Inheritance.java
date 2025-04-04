package OopsConcepts_inheritance;

class a
{
	public void show()
	{
		System.out.println("parent class");	
	}
}

class b extends a
{
	public void disp()
	{
		show();
		System.out.println("chaild class");
	}
}


public class Single_Inheritance 
{
	public static void main(String[]args)
	{
		
		b b1= new b();
		b1.disp();
		
		
	}

}
