import java.io.*;
public class Calculator2 {

	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num1=0,num2=0,choice=0;
		String name=null;
		char ch='n';
		//try 
		
		{
			System.out.println("enter first number");
			num1=Integer.parseInt(br.readLine());
			System.out.println("enter second number");
			num2=Integer.parseInt(br.readLine());
			System.out.println("enter your name");
			name =br.readLine();
		}
		//catch(Exception e) 
		{
		//	System.out.println(e);
		}
		do {
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulus");
			
			System.out.println("enter choice");
			//try 
			{
			choice=Integer.parseInt(br.readLine());
			}
			//catch(Exception e) {

			//System.out.println(e);
			//}
			switch(choice) {
			case 1:
			{
				System.out.println("result"+(num1+num2));
				break;
			}
			case 2:
			{
				System.out.println("result"+(num1-num2));
				break;
			}
			case 3:
			{
				System.out.println("result"+(num1*num2));
				break;
			}
			case 4:
			{
				System.out.println("result"+(num1/num2));
			
				break;
			}
			case 5:
			{
				System.out.println("result"+(num1%num2));
				break;
			}
			
			}
			 System.out.println("Do you want to continue(y/n)");
			// try 
			 {
			  ch=br.readLine().charAt(0);
			 }
			// catch(Exception e)
			 {
				 System.out.println("e");
			 }
		
	}while(ch=='y'||ch=='y');
		System.out.println("!Hello" +name+ "Calculator stopped: run program again to restrat");

}
}



