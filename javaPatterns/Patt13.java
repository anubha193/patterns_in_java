package javaPatterns;

public class Patt13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int o,p=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("  ");
			}
			o=i;
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+o);
				o++;
			}
			int n=p;
			for(int m=2;m<=i;m++)
			{
				System.out.print(" "+n);
				n--;
			}
			System.out.println();
			p=p+2;
		}
}
	}
