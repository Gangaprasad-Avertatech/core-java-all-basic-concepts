package MethodAndConstructor;

class Stud
{
	int a=10;
	public Stud()
	{
		System.out.println(a);		
	}
	public Stud(Stud ss)  //class type & class reference
	{
		a=ss.a;
		System.out.println(a);		

		
	}
}

public class CopyConstructor {

	public static void main(String[] args)
	{
		Stud s1 = new Stud();
		Stud s2 = new Stud(s1);

	}

}
