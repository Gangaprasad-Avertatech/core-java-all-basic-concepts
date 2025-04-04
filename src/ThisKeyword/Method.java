package ThisKeyword;

//this keyword  :method
//this method : call method to another method

class College
{
	void show()
	{
		System.out.println("welcome students");
	}
	void get()
	{
		//this.show();     //this method
		show();            //if you don't use this keyword compiler automatically call
		System.out.println("welcome teachers");
	}
	
	
}


public class Method {

	public static void main(String[] args)
	{
		College c1 = new College();
		c1.get();

	}

}
