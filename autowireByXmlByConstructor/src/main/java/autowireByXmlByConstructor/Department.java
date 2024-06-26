package autowireByXmlByConstructor;

public class Department {
	private String dept_name;

	public Department(String dept_name) {
		
		this.dept_name = dept_name;
	}

	@Override
	public String toString() {
		return "Department [dept_name=" + dept_name + "]";
	}

}
