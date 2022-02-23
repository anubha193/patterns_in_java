package study1;
import java.util.*;
public class Pattern_20 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
	     int n=scn.nextInt();
	     int sp =2*n-3;
	     int str=1;
	    
	    
	     for(int i=1;i<=n;i++)
	     {
	    	 int val=1;
	        for(int j=1;j<=str;j++)
	        {
	            System.out.print(val+ "\t");
	            val++;
	        }
	        
	        for(int j=1;j<=sp;j++)
	        {
	            System.out.print("\t");
	        }
	        if(i==n)
	        {
	        	str--;
	        	val--;
	        }
	        for(int j=1;j<=str;j++)
	        {
	        	val--;
	            System.out.print(val+"\t");
	            
	        }
	        System.out.println();
	       sp=sp-2;
	        str++;
	      }
	}

}
