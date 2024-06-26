package lifecycle.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.micrometer.observation.Observation.Context;

public class app2 {
	public static void main(String[] args) {
		 AbstractApplicationContext context= new ClassPathXmlApplicationContext("lifecycle/lifecycle/life2.xml");
		 context.registerShutdownHook();
		    
	}
   
}
