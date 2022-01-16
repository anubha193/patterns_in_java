package javaPatterns;

public class Patt11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int  k=1;
		for(int i=1;i<=5;i++) 
		{
			k=1;
			for(int j=5;j>=i;j--)
			{
				System.out.print(" "+k);
				k++;
			}
			System.out.println();
		}

	}

}
