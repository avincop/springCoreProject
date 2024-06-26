package lifecycle.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student2 {
	private String name;
    
	Student2(){
		System.out.println("default constructor calling");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName is calling");
		this.name = name;
	}
	@PostConstruct
	public void init() {
		System.out.println("init method calling");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method calling");
	}
	
	
}
