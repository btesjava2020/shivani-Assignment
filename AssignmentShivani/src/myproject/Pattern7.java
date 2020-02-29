package myproject;

public class Pattern7 {

	public static void main(String[] args) {
		int s=5 ,l=1;
		for(int i=1;i<=s;i++)
		{
			for(int j=s-1;j>=i;j--) {
				System.out.print(" ");
		}
		for(int j=1;j<=l;j++)
		{
			System.out.print("*");
		}
	
		System.out.println();
		l+=2;
		}
	}

}
