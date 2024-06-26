package ComponentInJava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("java")
public class Student {
	@Value("120")
    private int id;
	@Value("Avinash")
    private String name;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
    
}
