package myproject;
import java.util.Scanner;
public class Insertionsort {

	public static void main(String[] args) {
		int[] arr;
		int i = 0,j,k,temp;
		arr=new int[10];
		Scanner s= new Scanner(System.in);
		System.out.println("Enter elements in array");
		    //arr[i]=s.nextInt();
		for(i=0; i<arr.length;i++) {
			arr[i]=s.nextInt();
			for(j=0;j<=i;j++) {
				if (arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			 for(k=0;k<arr.length;k++) {
				 System.out.println(arr[k]+"\t");
			 }
		}

	}

}
