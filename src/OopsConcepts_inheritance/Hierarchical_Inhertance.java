package OopsConcepts_inheritance;

class college
{
	public void show()
	{
		System.out.println("collge name is jspm");
		
	}
}
class teacher extends college
{
	public void disp()
	{
		
		System.out.println("teacher name is xyz");

	}
}
class student extends college
{
	public void get()
	{
		show();
		System.out.println("student name is krishna");		
	}
}



public class Hierarchical_Inhertance
{

	public static void main(String[] args) 
	{
		student s1=new student ();
		s1.get();
		s1.show();
		
		teacher t1=new teacher();
		t1.disp();
		t1.show();
		

	}

}
