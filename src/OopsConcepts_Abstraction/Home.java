package OopsConcepts_Abstraction;

abstract class Vehical            //abstract class
{
	abstract void start();        //abstract method	
	
	void show()                   //non-abstract method
	{
		System.out.println("non-abstract method");
		
	}
}

class Bus extends Vehical
{
	void start()
	{
		System.out.println("bus start with BUTTON");
	}
}

class Car extends Vehical
{

	void start() 
	{
		System.out.println("bus start with KEY");		
	}
	
}

public class Home {

	public static void main(String[] args) 
	{
	Bus b1 = new Bus();
	b1.start();      //call abstract method
	b1.show();       //call non-abstract method
	
	Car c1 = new Car();
	c1.start();        //call abstract method
	b1.show();         //call non-abstract method
	
	
		
	

	}

}
