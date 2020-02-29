package myproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student2 {
	String rg_id;
	String name;
	float marks;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Student2()throws IOException{
		System.out.println("enter registration id");
		rg_id= br.readLine();
		System.out.println("enter name of the student");
		name=br.readLine();
		System.out.println("enter roll_no.");
		Float marks=Float.parseFloat(br.readLine());
		
	}
    
	void disp() {
		System.out.println("Rg_id:"+rg_id+""+"Name:"+name+""+"Marks:"+marks);
	}

		public static void main(String[] args)throws IOException {
			System.out.println("enter detail of first student");
			Student s1=new Student();
			System.out.println("enter detail of second student");
			Student s2=new Student();
			System.out.println("enter detail of third student");
			Student s3=new Student();
			System.out.println();
			
			System.out.println("detail of first student");
			s1.disp();
			System.out.println("detail of  second student");
			s2.disp();
			System.out.println("detail of third student");
			s3.disp();
		
	  }

	}

