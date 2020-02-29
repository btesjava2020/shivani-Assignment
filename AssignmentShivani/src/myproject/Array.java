package myproject;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);	
		int[]arr;

		arr=new int[10];
		for(int i=1;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}

}
