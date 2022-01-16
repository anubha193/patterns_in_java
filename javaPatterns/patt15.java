package javaPatterns;

public class patt15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=0;
		for(int i=1;i<=5;i++)
		{
			m=i;
			for(int j=5;j>=i;j--)
			{
				if((i==2&&(j==4 || j==3))||(i==3&& j==4))
				{
					System.out.print("  ");
				}
				else
				{
				System.out.print(" "+m);
				}
				m++;
			}
			System.out.println();
		}

	}

}
