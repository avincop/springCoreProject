package javaConfigUsingConstr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringConfig1 {
	
	public Department getDept() {
		Department d1= new Department();
		d1.setDeptName("java");
		return d1;
	}
	@Bean
	public Student getStData() {
		return new Student("Avinash",getDept());
	}

}
