package myproject;

public class Marriage {

	public static void main(String[] args) {
		int age=21; 
		char gender ='f' ;
		if (age>=18 && gender =='f') {
		System.out.println("eligible for marriage");
		}
			   
		else if (age>=21 && gender=='m') {
			System.out.println("Eligible for marriage");
		}
		else {
			System.out.println("not eligible for marriage");
		}
		

	}

}
