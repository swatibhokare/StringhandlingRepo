package stringAssignment;

import java.util.Arrays;

//9.WAP to split string into 2 tokens where string is “HELLO$WORLD”
public class String9 {

	public static void main(String[] args) {
		String s1="HELLO$WORLD";
		String arr []=s1.split("\\$");
				
		System.out.println(Arrays.toString(arr));

	}

}
