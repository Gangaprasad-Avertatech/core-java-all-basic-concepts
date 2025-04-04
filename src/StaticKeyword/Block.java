package StaticKeyword;

class Stud
{
	static                   //it is executed before the class loading
	{
		System.out.println("i am staitic block");
	}
	
	void get()
	{
		System.out.println("i am method");
	}
}

public class Block {

	public static void main(String[] args) 
	{
		Stud s1 = new Stud();
		s1.get();

	}

}
