package OopsConcepts_Encapsulation;

class Hotel
{
	public int a;      //data hiding
	
	void set(int x)     //setter method
	{
		a=x;
	}
	
	int get()          //getter method
	{
		//System.out.println(a);
		return a;       //return value
		
	}
}
public class Home {

	public static void main(String[] args) 
	{
		Hotel h1 = new Hotel();
		h1.set(10);    //set value 
		
		int f=h1.get(); //get value
		System.out.println(f);

	}

}
