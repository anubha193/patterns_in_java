package javaPatterns;

public class Patt14 {

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
				if((i==4 &&(k==2||k==3))||(i==3 && k==2))
				{
				System.out.print("    ");
			}
				else
				{
					System.out.print("   "+k);	
				}
			}
			System.out.println();
		}

	}

}
