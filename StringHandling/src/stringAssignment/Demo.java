package stringAssignment;

public class Demo {
	public static void javapattern(String s)
	{
		String s1="java";
		for(int i=0;i<=s1.length();i++)
		{
			String s2=s.substring(0,i);
			System.out.println(s2);
		}
		System.out.println(" ");
	}
	
	

	public static void main(String[] args) {
		String s1="JAVA";
		 javapattern(s1);
		System.out.println("---------using nested for loop---------");
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<i+1;j++)
			{System.out.print(s1.charAt(j)+" ");
				
			}
		
			System.out.println();
		}
		String s5="rose is red";
		char ch[]=s5.toCharArray();
		System.out.println("character array");
               for(char c:ch)
               {
            	   System.out.println(c);
               }
               //////////////
               String sarr[]=s5.split(":");
               for(String s:sarr)
               {
            	   System.out.println(s);
               }
	}

}
