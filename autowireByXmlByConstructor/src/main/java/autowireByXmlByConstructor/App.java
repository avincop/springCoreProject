package autowireByXmlByConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("autowireByXmlByConstructor/emp.xml");
		Emp emp = context.getBean(Emp.class);
		System.out.println(emp);
    }
}
