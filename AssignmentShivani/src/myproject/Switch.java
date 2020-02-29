package myproject;

public class Switch {

	public static void main(String[] args) {
		int marks=80;
		int m=marks/10;
		switch(m)
		{
		case 9:
		case 8:
			System.out.print("excellent");
		break;
		case 7:
		case 6:
			System.out.println("very good");
		break;
		case 5:
			System.out.println("good");
			break;
		case 4:
			System.out.println("average");
			break;
		case 3:
			System.out.println("fail");
			break;
		default:
			System.out.println("better luck!");
		}

	}

}
