package OopsConcepts_Polymorphism;

class Sample
{
	void show ()    
	{
		System.out.println("first");
	}
	void show(int x,int y)
	{
		System.out.println("second");

		
	}
	
}



public class MethodOverloding {

	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		s1.show();
		s1.show(10,10);
	}
	
	

}
