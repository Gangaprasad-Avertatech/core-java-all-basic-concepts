package StaticKeyword;

class Emp
{
	int eid;
	String ename;
	static String cname="averta tech";         //Static variable
	
	void get(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;
		
		//this.cname=cname;
	}
	void display()
	{
		System.out.println("Emp Id :" + eid);
		System.out.println("Emp name :" + ename);
		System.out.println("Emp company name :"+ cname);
	}
	
}
public class Variable
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp();
		e1.get(107, "gangaprasad");
		e1.display();
		
		Emp e2 = new Emp();
		e2.get(107, "krishna") ;
		e2.display();
		
		
	}

}
