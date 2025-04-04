package FinalKeyword;

class a
{
	final void show()  //  final method    you can not override it
	{
		System.out.println("final method ");

	}
}
class b extends a
{

	void show()
	{
		System.out.println("final ");

		
	}
	
}

public class Method {

	public static void main(String[] args) 
	{
		a a1=new a();
		a1.show();

	}

}
