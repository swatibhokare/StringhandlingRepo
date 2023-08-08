package stringAssignment;

public class String13 {
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
	
	

	public static void main(String[] args) {
//		String s1="java is programing language";
//		String[] words=s1.split("\\s+");
//		int count=words.length;
//		System.out.println("total number of words in string:"+count);
       String s1="java is programming language   ";
       findnoofwords(s1);
	}

}
