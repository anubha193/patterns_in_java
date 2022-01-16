package javaPatterns;

public class Patt16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i<=9;i++)
		{
			for(int j=8;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			for(int m=i;m>=6;m--)
			{
				System.out.print(" *");
				}
			for(int j=8;j>=i;j--)
			{
				System.out.print("    ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			for(int m=i;m>=6;m--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=1;i<=26;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int k=13;k>=i;k--)
			{
				System.out.print(" *");
			}
			for(int m=13;m>=i;m--)
			{
				System.out.print(" *");
			}
		
			System.out.println();
		}
		
	}

}
