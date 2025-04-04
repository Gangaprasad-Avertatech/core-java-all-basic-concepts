package ThisKeyword;

//this keyword  :variable
// this variable is to initialize current class  instance variable
class TajHotel
{
	int sid;          //instance variable
	String sname;
	String semail;
	
	
	void getdata(int sid,String sname,String semail)
	{
		this.sid=sid;
		this.sname=sname;
		this.semail=semail;
	}
	void display()
	{
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(semail);
	}
}


public class Variable     
{

	public static void main(String[] args) 
	{
		TajHotel t1 = new TajHotel();
		t1.getdata(10, "santosh","santosh@gmail.com");
		t1.display();
		
	}

}
