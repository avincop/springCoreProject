package springJdbcJavaFile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component("temp")
public class JdbcTemplate1 extends JdbcTemplate {
	JdbcTemplate1 (@Value("#{dataSource}")DataSource1 datasource){
		super.setDataSource(datasource);
	}

}
