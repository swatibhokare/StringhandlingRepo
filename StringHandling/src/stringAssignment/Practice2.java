package stringAssignment;

public class Practice2 {
	public static void findsecondchar(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch;
			ch=s.charAt(i);
			if(i%2!=0)
			{
				System.out.print(ch+" ");
			}
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		String s=" java is programing language";
		///String s1[]=s.split(" ");
		findsecondchar(s);
	}

}
