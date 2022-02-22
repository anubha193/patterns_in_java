import java.util.*;

public class Prime_factorisation{

public static void main(String[] args) {
  // write your code here  
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int i=2;i<n;i++)
  {
      while(n%i == 0) {
            System.out.print(i+" ");
            n = n/i;
         }
  }
           if(n >2) {
         System.out.println(n);
      }
  
 }
}
