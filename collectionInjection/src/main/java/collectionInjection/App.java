package collectionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext("collectionInjection/coll.xml");
    Collection1 col= (Collection1)context.getBean("obj");
    System.out.println(col.getAddressList());
    System.out.println(col.getAddressSet());
    System.out.println(col.getAddressMap());
    System.out.println(col.getUserDetail());

  }
}
