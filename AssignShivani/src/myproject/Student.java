package myproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
	String rg_id;
	String name;
	float marks;
	public String getRg_id() {
		return rg_id;
	}

	public void setRg_id(String rg_id) {
		this.rg_id = rg_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Student()throws IOException{
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

		//public static void main(String[] args)throws IOException {
			//System.out.println("enter detail of first student");
			//Student s1=new Student();
			//System.out.println("enter detail of second student");
			//Student s2=new Student();
			//System.out.println("enter detail of third student");
			//Student s3=new Student();
			//System.out.println();
			
			//System.out.println("detail of first student");
			//s1.disp();
			//System.out.println("detail of  second student");
			//s2.disp();
			//System.out.println("detail of third student");
			//s3.disp();
		
	 // }

	}


