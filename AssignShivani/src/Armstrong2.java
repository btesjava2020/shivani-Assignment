import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrong2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=0;
		System.out.println("Enter any number");
		num=Integer.parseInt(br.readLine());
				int n=num;
				int len=0,temp,sum=0,pow=1;
				for(;num>=0;)
				{
					num=num/10;
					len++;
				}
	           num=n;
	           System.out.println(len);
	           for(;num>0;)
	           {
	        	   temp=num%10;
	        	   for(int j=1;j<=len;j++)
	        	   {
	        		   pow=pow*temp;
	        	   }
	        	   sum=sum+pow;
	        	   pow=1;
	        	   num=num/10;
	           }
	           System.out.println("sum="+sum);
	           if(sum==n)
	           {
	        	   System.out.println("Armstrong");
	           }
	           else
	           {
	        	   System.out.println("Not Armstrong");
	           }
	}
	     

}
