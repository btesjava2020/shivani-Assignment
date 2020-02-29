package myproject;
import java.util.Scanner;

public class Pascal {

	public static void main(String[] args) {
		int r,i,k,number=1,j;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter no. of rows");
		r= s.nextInt();
       for (i=0;i<r;i++) {
    	   for(k=r;k>i;k--) {
    		   System.out.print(" ");
    	   }
    	   number=1;
    	   for(j=0;j<=i;j++) {
    		   System.out.print(number+" ");
    		   number=number*(i-j)/(j+1);
    		   
    	   }
    	   System.out.println( );
    	   
       }
	}

}
