package StaticKeyword;
class phone
{
	void display()    //non static method
	{
		System.out.println("hi");
	}
	static void show() //static method
	{
		System.out.println("welcome");
	}
}
public class Method {

	public static void main(String[] args) 
	{
		phone p1= new phone();
		p1.display();
		
		phone.show();   // no need to create obj of class

	}

}
