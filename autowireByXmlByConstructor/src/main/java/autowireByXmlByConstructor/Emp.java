package autowireByXmlByConstructor;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	private String name;
	private Department dept;
	private Address adr;
	@Autowired
	public Emp(String name, Department dept, Address adr) {
		
		this.name = name;
		this.dept = dept;
		this.adr = adr;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", dept=" + dept + ", adr=" + adr + "]";
	}
	

}
