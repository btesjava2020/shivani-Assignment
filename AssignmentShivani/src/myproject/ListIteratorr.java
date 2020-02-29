package myproject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorr {

	public static void main(String[] args) {
		ArrayList<String>arr=new ArrayList<String>();
		arr.add("ABC");
		arr.add("XYZ");
		arr.add("Riya");
		arr.add("Anu");
		arr.add("Sneha");
ListIterator itr= arr.listIterator();
		while(itr.hasNext()) {
			itr.next();
		}
		  while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		}
		
		

	
	}


