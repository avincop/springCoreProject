package autowireByXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("autowireByXml/store.xml");
		Store st = context.getBean(Store.class);
		System.out.println(st.getName());
		System.out.println(st.getProduct().getP_id());
		System.out.println(st.getProduct().getP_name());
		
    }
}
