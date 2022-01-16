package javaPatterns;

public class Patt12 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		 for(int i=1;i<=5;i++)
	       {
	    	   for(int j=1;j<=i;j++)
	    	   {
	    		   if((i==4 &&(j==2||j==3))||(i==3 && j==2))
	    		   {
	    			   System.out.print("  ");
	    		   }
	    		   else
	    		   {
	    		   System.out.print(" "+j);
	    	   }
	    	   }
	    	   System.out.println();
	       }

	}

}
