package stringAssignment;

public class Demo1 {

	public static void findnoofwords(String s)
	{
		int i;
		s=s.trim();
		int len=s.length();
	     int count=0;
	     char ch1,ch2;
	     for(i=0;i<len-1;i++) 
	     {
	    	 ch1=s.charAt(i);
	    	 ch2=s.charAt(i+1);
	    	 if(ch1==' '&& ch2!=' ')
	    	 {
	    		 count++;
	    	 }
	     }
	     System.out.println("no of words:"+(count+1));
	}
	
	public static void findduplicates(String s)
	{
		String words[]=s.split(" ");
		System.out.println("Duplicate words in a given string:");
		for(int i=0;i<words.length;i++)
		{
			int count=1;
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))  //.equals method checks object in the string.
				{
					count++;
					words[j]="0"; //set words[j]=0 to avoid printing visited words.
				}
				
			}
			if(count>1&&words[i]!="0")// if count is grater than then display duplicate word.
			{
				System.out.println(words[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		String s1="i am happy because i saw others are happy";
		findnoofwords(s1);
		findduplicates(s1);

	}

}
