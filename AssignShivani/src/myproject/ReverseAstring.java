package myproject;

public class ReverseAstring {

	public static void main(String[] args) {
		String name="shivani";
		int leng=name.length();
		String rev="";
		for(int i=leng-1;i>=0;i--) {
			rev+=name.charAt(i);
		}
		System.out.println("Reverse of "+name+ " is "+rev );
	}

}
