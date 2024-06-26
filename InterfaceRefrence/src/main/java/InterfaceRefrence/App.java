package InterfaceRefrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
   ApplicationContext context= new ClassPathXmlApplicationContext("InterfaceRefrence/sim.xml");
   Student st= (Student) context.getBean("std");
   Simple sm=(Simple) context.getBean("smp");
   sm.show();
   
  }
}
