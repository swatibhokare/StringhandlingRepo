package stringhandling_3_aug;
//wap to print char present in string in upper case using for loop.
public class Stringtest {

	public static void main(String[] args) {
		String s1="i love my india";
		
		s1=s1.toUpperCase();
		int i,len=s1.length();
		for(i=0;i<len;i++)
		{
			System.out.print(s1.charAt(i));
		}
	}

}
