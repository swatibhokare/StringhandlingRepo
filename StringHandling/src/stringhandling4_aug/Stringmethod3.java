package stringhandling4_aug;

public class Stringmethod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1="hello";
      char ch1,ch2;
      int count=0;
      for(int i=0;i<s1.length();i++)
      {ch1=s1.charAt(i);
    	  ch2=s1.charAt(i);
    	  if(ch1==ch2)
    	  {
    		  count++;
    	  }
      }
      System.out.println(ch1+"="+count);
	}

}
