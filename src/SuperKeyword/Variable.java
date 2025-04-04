package SuperKeyword;

class a
{
	String cname="sycet";	
}
class b extends a
{
	String cname="jspm";	

	void show()
	{
		System.out.println("college name :" + super.cname);   // access parent class variable
	}
}

public class Variable {

	public static void main(String[] args) 
	{
		b a1= new b();
		a1.show();
		

	}

}
