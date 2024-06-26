package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import main.config.SpringConfig;
import main.entity.EmpEntity;
import main.service.ServiceImp;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
        ServiceImp service=(ServiceImp) context.getBean("service");
        EmpEntity entity= context.getBean(EmpEntity.class);
        entity.setId(1304);
        entity.setName("Avinash");
        entity.setCity("jaipur");
        int result= service.saveData(entity);
        System.out.println(result);
    }
}
