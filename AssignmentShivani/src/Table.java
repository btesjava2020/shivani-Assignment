import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
     Scanner	s =new Scanner(System.in);
     System.out.println("enter a no.");
     int table=s.nextInt();
    //int table=12;
    for(int i=1;i<=10;i++) {
    	System.out.println(table + "x" + i + "=" + table*i);
    }
	}
}
