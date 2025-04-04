package OopsConcepts_Polymorphism;

class College
{
	void show(int x)
	{
		System.out.println("college name is : coep");
	}
}
class Student extends College
{
	
	void show(int x)
	{
		System.out.println("Student name is : gnagaprasad navakikar");

	}
}

public class MethodOverriding
{

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.show(10);
		
	}

}
