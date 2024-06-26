package ValueComponentInJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	/*
		  ApplicationContext context=new
		 * ClassPathXmlApplicationContext("com/resource/config.xml"); Student
		 * std=(Student)context.getBean("student"); System.out.println(std);
		 */
    	
    	
    	ApplicationContext context=new AnnotationConfigApplicationContext(ConfigFile.class);

        Student std=(Student)context.getBean(Student.class);
        System.out.println(std);
    }
}
