package myproject;

public class Statements {

	public static void main(String[]args) {
		// TODO Auto-generated method stub
		int marks=50;
    if (marks>=80)
    {
    	System.out.print("Marks is>=80=");
	    System.out.println("Excellent");
     }
    else if (marks>=70&& marks<80)
    {   System.out.print("Marks is>=70&&<80=");
        System.out.println("Very Good");
    }
  else if (marks>=50&& marks<70 )
  {
	  System.out.print("Marks is>=50&&<70=");
	  System.out.println("Good");
	  }
 
  else if (marks>=40&& marks<50)
  {   System.out.print("Marks>=40&&<50=");
	  System.out.println("Average");
	  }
  else 
  {   System.out.print("Marks is<40=");
	  System.out.println("fail");
  }
	}

}
