package javaPatterns;
import java.util.*;
public class Patt17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     for(int i=1;i<=7;i++)
     {
    	 for(int j=6;j>=i;j--)
    	 {
    		 System.out.print(" ");
    	 }
    	 for(int k=1;k<=i;k++)
    	 {
    		 if((i==3&&k==2)||(i==4&&(k==2||k==3))||(i==5&&(k==2||k==3||k==4))||(i==6&&(k==2||k==3||k==4||k==5)))
    			
    		 {
    		 System.out.print("  ");
    	 }
    		 else
    		 {
    			 System.out.print(" *"); 
    		 }
    	 }
    	 System.out.println();
     }
}

}
