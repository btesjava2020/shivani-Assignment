package myproject;

public class CountSubstring {

	public static void main(String[] args) {
    String str="JavaExampleJavaCodeJavaProgram";
    String strFind="java";
    int count=0; int fromIndex=0;
    while((fromIndex=str.indexOf(strFind,fromIndex))!=-1) {
    	System.out.println("Found at index: "+fromIndex);
    	count++;
    	fromIndex++;
    }
    {
       System.out.println("Total occurance: "+count);
	}

}
}
