package stringAssignment;

public class ReverseString {
	public static void revString(String s1)
	{
		s1=s1+" ";
		String s2="",s3="";
		int len=s1.length();
		char ch;
		for(int i=0;i<len;i++)
		{
			ch=s1.charAt(i);
			if(ch!=' ')
			{s2=s2+ch;
				
			}
			else
			{
				s3=s2+" "+s3;
				s2="";
			}
		}
		System.out.println(s3);
	}

	
	public static void revString1(String str)
	{
		String sarr[]=str.split(" ");
		int i,len=sarr.length;
		String newstr="";
		for(i=len-1;i>=0;i--)
		{
			newstr=newstr+sarr[i]+" ";
		}
		System.out.println(newstr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="Computer is fun";
         revString(s);
         revString1(s);
         
        
	}

}
