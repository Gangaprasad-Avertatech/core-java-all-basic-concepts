package OopsConcepts_inheritance1;



class College
{
	public void run()
	{
		System.out.println("college name is : coep");
	}
}
class Student extends College
{
	public void show()
	{
		System.out.println("Studtent name is : Gangaprasad");
	}
}
class Exam extends Student
{
	int math=90,java=99,db=70;
}
class Result extends Exam
{
	public void display()
	{
		int total;
		total=math+java+db;
		System.out.println("result :"+ total);
	}
}
public class Multilevel_Inheritance {

	public static void main(String[] args) 
	{

		Result r1=new Result();
		r1.run();
		r1.show();
		r1.display();

	}

}
