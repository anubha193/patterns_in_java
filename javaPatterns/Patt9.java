package javaPatterns;

public class Patt9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i=1;i<=5;i++)
	        {
	        	for(int j=4;j>=i;j--)
	        	{
	        		System.out.print("  ");
	        	}
	        	for(int k=1;k<=i;k++)
	        	{
	        		System.out.print(" *");
	        	}
	        	 for(int m=2;m<=i;m++)
	             {
	             	System.out.print(" *");
	             }
	        	System.out.println();
	        }

		 for(int i=1;i<=4;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("  "); 
			 }
			 for(int k=4;k>=i;k--)
			 {
				 System.out.print(" *"); 
			 }
			 for(int m=3;m>=i;m--) {
				 System.out.print(" *"); 
			 }
			 System.out.println();
		 }
	}

}
