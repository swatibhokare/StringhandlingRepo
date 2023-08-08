package stringhandling4_aug;

public class Demo {

	public static void main(String[] args) {
		String s1="swati";
		String s2="swati";
		String s3=s1;
		String s4="rahul";
		System.out.println("s1==s2:"+(s1==s2));//true
		System.out.println("s1==s3:"+(s1==s3));//true
		System.out.println("s1==s4:"+(s1==s4));//false
	
	
		//equals()method checks contain present in string	
	  String m1="rohan";
	  String m2=new String("rohan");
	  String m3=new String("rohan");
	  System.out.println(m1.equals(m3));
	}

}
