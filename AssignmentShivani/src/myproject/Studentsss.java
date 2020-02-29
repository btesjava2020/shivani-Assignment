package myproject;

public class Studentsss {
	int rollno;
	String name;
	int age;
	public int getRollno() {
		return rollno;
	}
	
	public String getName() {
		return name;
	}
	 public int getAge() {
		return age;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	Studentsss(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}

}
