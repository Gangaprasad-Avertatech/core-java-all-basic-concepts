package String;

public class String_Methods 
{

	public static void main(String[] args) 
	{
		
		 String name = "gangaprasad navkikar";
		 
		 String str1="hello";
		 String str2="HELLO";
				 
		 System.out.println(name.toUpperCase());    // convert upper case
		 System.out.println(name.toLowerCase());    // convert Lower case
		 System.out.println(name.charAt(4));        // at index
		 System.out.println(name.substring(4));
		 System.out.println(name.substring(5,8));   // show between the no 
		 System.out.println(name.charAt(4)); 
		 
		 System.out.println(str1.equals(str2));           //check data
		 System.out.println(str1.equalsIgnoreCase(str2));
		 System.out.println(str1.replace("o", "ii"));
		 
		 System.out.println(str1.length());   //show length
		 
		 String str3=" hello world ";
		 System.out.println(str3.trim());  //remove space
		 
		 
		 
		 
		 
		 
	

	}

}
