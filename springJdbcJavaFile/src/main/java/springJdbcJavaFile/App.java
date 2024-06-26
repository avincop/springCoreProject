package springJdbcJavaFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
       JdbcTemplate1 temp=(JdbcTemplate1) context.getBean("temp");
      int result= temp.update("insert into emp values(20121,'Aram','delhi')");
       System.out.println(result);
    }
}
