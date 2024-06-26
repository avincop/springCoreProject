package javaConfig1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig1 {
	@Bean
	public Student getObj1() {
		Student s1= new Student();
		s1.setName("Avinash");
		s1.setId(101);
		s1.setCatg('A');
		s1.setFees(189256.50);
		s1.setHight(5.6f);
		s1.setLive(false);
		return s1;
	}
	@Bean("bean1")
	public Student getObj2() {
		Student s1= new Student();
		s1.setName("Java");
		s1.setId(201);
		return s1;
	}
}
