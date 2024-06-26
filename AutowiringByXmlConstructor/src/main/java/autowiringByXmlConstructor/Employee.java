package autowiringByXmlConstructor;

public class Employee {
     private int empId;
     private Department dept;
     
     Employee(int empId, Department dept){
    	 this.empId=empId;
    	 this.dept=dept;
     }

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", dept=" + dept + "]";
	}
     
}
