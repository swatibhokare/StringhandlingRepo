package stringhandling_3_aug;

public class StringMethodTest1 {

	public static void main(String[] args) {
		String s1="hello , hi";
		String s2="WELCOME";
		s1.toUpperCase();
		System.out.println(s1); //hello
		
		//case 1
		System.out.println(s1.toUpperCase());//HELLO
		
		//case 2
		s1=s1.toUpperCase();
		System.out.println(s1);//HELLO
		
		String s3=s2.toLowerCase();
		System.out.println(s3);//wecome
		
		//length()-how many chars are present
		int len=s1.length();
		System.out.println("length of s1:"+len);
		System.out.println("length of s2:"+s2.length());
		//charAt(int index)
		//char ch1=s1.charAt(10);java.lang
		
		
		char ch1=s1.charAt(s1.length()-1);
		//char ch1=s1.charAt(len-1);
		System.out.println("char present at index 1 is:"+ch1);
	    	
	}

}
