package myproject;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorMethod {

	public static void main(String[] args) {
		//ArrayList a1=new ArrayList(10);
		Vector a1=new Vector(11);
		for(int i=0;i<=10;i++) {
			a1.add(i);
		}
			System.out.println("Size="+a1.size());
			System.out.println(a1.capacity());
			a1.trimToSize();
           System.out.println("new capacity"+a1.capacity());
		
			//for (String s:a1) {
			//	System.out.println(s);
			//}
           
			ListIterator itr= a1.listIterator();
			
			while(itr.hasNext()) {
				itr.next();
			}
			while(itr.hasPrevious()) {
				System.out.println(itr.previous());
			}
			
		}
	}



