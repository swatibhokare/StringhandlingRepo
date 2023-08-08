package stringhandling_3_aug;

public class PrintAllVowelsinString {
	
	public static void printAllvovelsfromString(String s)
	{int i,len=s.length();
	char ch;
	
	for(i=0;i<len;i++)
	{
		ch=s.charAt(i);
		if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+" is vowel");
		}
		else
		{
			System.out.println(ch+" is not vowel");
		}
	}
		
	}
	public static void printvovels(String s)
	{
		int i,len=s.length();
		char ch;
		
		for(i=0;i<len;i++)
		{
			ch=s.charAt(i);
			if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch);
			}
	}
	
	}

	public static void main(String[] args) {
		String s1="welcome";
		printvovels(s1);
		
	}

}
