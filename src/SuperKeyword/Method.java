package SuperKeyword;


class College
{
	void show()
	{
		System.out.println("college name is : coep");
	}
}
class Student extends College
{
	
	void show()
	{
		super.show();       //super method  & first call parent method
		System.out.println("Student name is : gnagaprasad navakikar");

	}
}


public class Method {

	public static void main(String[] args)
	{

		Student s1 = new Student();
		s1.show();

	}

}
