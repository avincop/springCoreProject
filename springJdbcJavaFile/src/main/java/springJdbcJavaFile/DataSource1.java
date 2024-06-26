package springJdbcJavaFile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
@Component("dataSource")
public class DataSource1 extends DriverManagerDataSource {
   DataSource1(@Value("jdbc:mysql://localhost:3306/login")String url,@Value("root")String userName, @Value("123456")String password){
	   super.setUrl(url);
	   super.setUsername(userName);
	   super.setPassword(password);
   }
}
