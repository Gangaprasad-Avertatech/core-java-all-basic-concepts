package MethodAndConstructor;

class Phone                  
{
	public Phone()          //its default Constructor  and no return type
	{
		System.out.println("hello");		
	}
	
	public Phone(int x,int y)  //its Parameterize  Constructor
	{
		System.out.println(x);	
		System.out.println(y);	
		
	}
	void show()            //method
	{
		System.out.println("gangaprasad");		
	}
}


public class Cunstroctor 
{
	public static void main(String[]args)
	{
		Phone p1 = new Phone();     //constructor automatically call when object created
		 new Phone(2,5);  // call parameterize constructor
		 
		p1.show();                  //call method
	}

}
