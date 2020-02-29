package myproject;

public class CountOccuranceofSubstring {

	public static void main(String[] args) {
		String str="JavaExamplesJavaCodeJavaProgram";
		String strFind="Java";
		int Count=0;int fromIndex=0;
		while((fromIndex=str.indexOf(strFind,fromIndex))!=-1){
			System.out.println("Found at index: "+fromIndex);
			Count++;
			fromIndex++;
		}
		System.out.println("Total occurance: " + Count);

	}

}
