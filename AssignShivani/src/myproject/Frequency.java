package myproject;
import java.util.Scanner;

public class Frequency {

	public static void main(String[] args)  {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		int n = 0,d,digit,div,f;
		int num=s.nextInt();
		System.out.println("Digit/t Frequency");
		for(d=0;d<=9;d++) {
			f=0;
			for(div=n;div>0;div/=10) {
				digit=div%10;
				if(digit==d) 
					f++;
				
			}
			if(f>0) {
				System.out.println(d+" "+f);
				
			}
		}
	}

}
