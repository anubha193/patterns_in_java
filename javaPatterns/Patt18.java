package javaPatterns;

public class Patt18 {

	public static void main(String[] args) {
		// TODO Auto-generated method 6
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(i==j||i+j==8)
				{
					System.out.print(" *");
				}
				else
				{
				System.out.print("  ");
			}
			}
			System.out.println();
		}

	}

}
