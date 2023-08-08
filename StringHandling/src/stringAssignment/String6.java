package stringAssignment;
//6.Write a Java program to compare two strings
public class String6 {

	public static void main(String[] args) {
		String s1="Javap";
		String s2="Java";
		String s3="Java";
		String s4="Oop";
		System.out.println(s1.length());
		System.out.println(s1.compareTo(s2));//if s1 > s2, it returns positive number 
        System.out.println(s2.compareTo(s3));// if s1==s3 ,it returns 0
        System.out.println(s1.compareTo(s4));//if s1<s4 ,it returns negative number
	}

}
