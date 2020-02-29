package myproject;

import java.io.IOException;

public class Student3 {

	String reg_id;
	String name;
	float marks;
	Student3(String reg,String na,float mark){
		reg_id=reg;
		name=na;
		marks=mark;
		
	}
	void disp() {
		System.out.println("Rg_id:"+reg_id+""+"Name:"+name+""+"Marks:"+marks);
  }
	public static void main (String[]args) throws IOException {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.disp();
		s2.disp();
		s3.disp();
	}
  }
