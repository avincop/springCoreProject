package valueComponentConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
		  
		  ApplicationContext context=new ClassPathXmlApplicationContext("valueComponentConstructor/student.xml"); 
		  Student std=(Student)context.getBean(Student.class); 
		  System.out.println(std);
		 
    	
    	
    }
}
