package myproject;

public class Pattern4 {

	public static void main(String[] args) {
		int s=5 ,l=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=s;j++) {
				System.out.print(" ");
		}
		for(int j=1;j<=l;j++)
		{
			System.out.print(" *");
		}
	
		System.out.println();
		s--;
		l+=1;
		}
			
	}

}
