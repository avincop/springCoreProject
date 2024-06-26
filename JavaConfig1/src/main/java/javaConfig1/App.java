package javaConfig1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  public static void main(String[] args) {
    ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig1.class);
    Student s1=(Student) context.getBean("getObj1");
    System.out.println(s1.getName());
    System.out.println(s1.getCatg());
    System.out.println(s1.getFees());
    System.out.println(s1.getHight());
    System.out.println(s1.isLive());
    
    System.out.println("------------------");
    Student s2=(Student) context.getBean("bean1");
    System.out.println(s2.getName());
    System.out.println(s2.getId());

  }
}
