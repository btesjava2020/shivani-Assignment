package myproject;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=18;
		if (a%3==0&& a%5==0)
		{
			System.out.println("fizz buzz");
		}
		else if (a%3==0)
		{
			System.out.println("fizz");
		}
		else if (a%5==0)
		{
			System.out.println("buzz ");
		}
		else
		{
			System.out.println(a);
		}
		
	}

}
