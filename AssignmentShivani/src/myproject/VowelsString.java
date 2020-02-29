package myproject;

public class VowelsString {

	public static void main(String[] args) {
		String str="Bebo Technical Education Services";
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				count=count+1;
		//	System.out.println(count);
		}
		System.out.println("Vowles are"+count);

	}

}
