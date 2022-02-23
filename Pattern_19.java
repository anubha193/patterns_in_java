package study1;
import java.util.*;
public class Pattern_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
		 System.out.println("enter a number");
	       int n=scn.nextInt();
	       int sp=n/2;
	       int str=1;
	       int m=1;
	       for(int i=1;i<=n;i++)
	       {
	           int p=m;
	           for(int j=1;j<=sp;j++)
	           {
	               System.out.print("\t");
	           }
	           for(int j=1;j<=str;j++)
	           {
	               
	           System.out.print(p+"\t");
	           if(j<=str/2)
	           p++;
	           else
	           p--;
	           }
	            System.out.println();
	           if(i<=n/2)
	           {
	               m++;
	            sp--;
	            str=str+2;
	           }
	           else
	           {
	               m--;
	           sp++;
	           str=str-2;
	           }
	       }
	}

}
