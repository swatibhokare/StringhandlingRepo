package stringAssignment;
//3.Compare string using new operator when new is present see different reference is there.

public class String3 {

	public static void main(String[] args) {
		String s1="Hello";
		String s2=new String("Hello");
	if(s1==s2)
	{
		System.out.println("have same refernce--------");
	}
	else
	
	{
		System.out.println("diffrent refernce--------");
	}

	}

}
