package lifecycle.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student1 implements InitializingBean, DisposableBean{
	private String name;
    
	Student1(){
		System.out.println("default constructor calling");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName is calling");
		this.name = name;
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method calling");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method calling");
		
	}
	
	
}
