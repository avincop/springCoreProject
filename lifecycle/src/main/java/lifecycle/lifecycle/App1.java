package lifecycle.lifecycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("lifecycle/lifecycle/life1.xml");
        Student1 st=context.getBean(Student1.class);
        System.out.println(st.getName());
        System.out.println("----------------------");
        context.registerShutdownHook();
    }
}
