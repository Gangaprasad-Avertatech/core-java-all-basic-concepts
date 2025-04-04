package MethodAndConstructor;

class Tv
{
	String Cname="sony";
	String Color="black";
	
	void channel()             // method 
	{
		System.out.println("set max");
	}
	void game()
	{
		System.out.println("PUBG");
	}
}


public class Method {

	public static void main(String[] args) 
	{
		Tv t1= new Tv();        //cretee object
		t1.game(); 
		t1.channel();

	}

}
