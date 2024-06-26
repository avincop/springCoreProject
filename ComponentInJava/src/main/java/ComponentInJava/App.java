package ComponentInJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("ComponentInJava/st.xml");
    	Student st=(Student) context.getBean("java");
    	System.out.println(st);
    	
    			
    }
}
