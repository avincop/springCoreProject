package javaConfigUsingConstr;

public class Student {
	
	private String name;
	private Department dept;
	public Student(String name, Department dept) {
	
		this.name = name;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public Department getDept() {
		return dept;
	}
	

}
