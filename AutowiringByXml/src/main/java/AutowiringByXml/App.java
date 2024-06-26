package AutowiringByXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowiringByXml/auto.xml");
		Student st = context.getBean(Student.class);
		System.out.println(st.getName());
		System.out.println(st.getAddress().getCity());
		System.out.println(st.getDept().getDeptId());

	}
}
