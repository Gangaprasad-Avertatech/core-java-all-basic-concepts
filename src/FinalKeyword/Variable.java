package FinalKeyword;
 
class sample
{
	final int a=10;  // it will be constant
	//a=6
	void display()
	{
		System.out.println(a);
	}
}

public class Variable 
{
	public static void main(String[] args) 
	{
		 sample s=new sample();
		 s.display();

	}

}
