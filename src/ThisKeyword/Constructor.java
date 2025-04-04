package ThisKeyword;


//this keyword  :method
//this Constructor : its used to reuse the constructor

class Employee
{
	public Employee()
	{
		this(2);
		System.out.println("Employee name is :gangaprasad");
	}
	
	public Employee(int x)
	{
		System.out.println("Employee name is :krishna");

	}
	
}

public class Constructor {

	public static void main(String[] args) 
	{
		new Employee();
		

	}

}
