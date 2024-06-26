package javaConfigCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
       Emp emp=(Emp) context.getBean("getObj");
      System.out.println(emp.getName());
      System.out.println(emp.getMob());
      System.out.println(emp.getDept());
      System.out.println(emp.getMap());
    }
}
