package main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.entity.StudentEntity;
import main.service.ServiceLogicImp;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("operation.xml");
		ServiceLogicImp impl=(ServiceLogicImp)  context.getBean("service");
		StudentEntity entity=new StudentEntity();
		entity.setId(200);
		entity.setName("Avinash");
		entity.setCity("jaipur");
		int result=impl.saveData(entity);
		System.out.println(result);
    }
}
