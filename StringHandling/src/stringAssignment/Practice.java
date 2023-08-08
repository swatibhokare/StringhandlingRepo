package stringAssignment;

public class Practice {

	public static void main(String[] args) {
		String names[]= {"navin","kaushal","keshav","nishank","subodh"};
		String temp;
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println("the names in alphabeticaly");
		
			System.out.println("first name after sorting:"+" "+names[0]);
			System.out.println("last name after sorting:"+" "+names[names.length-1]);
			
		

	}

}
