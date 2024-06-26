package javaConfigUsingConstr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
  public static void main(String[] args) {
	  ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig1.class);
      Student st=(Student) context.getBean("getStData");
      System.out.println(st.getName());
      System.out.println(st.getDept().getDeptName());
  }
}
