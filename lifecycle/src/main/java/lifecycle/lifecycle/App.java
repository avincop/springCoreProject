package lifecycle.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("lifecycle/lifecycle/life.xml");
        Student st=context.getBean(Student.class);
        System.out.println(st.getName());
        System.out.println("----------------------");
        context.registerShutdownHook();
    }
}
