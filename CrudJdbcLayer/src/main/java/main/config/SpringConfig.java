package main.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
@ComponentScan("main")
public class SpringConfig {
	
	public DataSource getDataSource() {
		DriverManagerDataSource source= new DriverManagerDataSource("jdbc:mysql://localhost:3306/login","root","123456");
		return source;
	}
	@Bean
	public JdbcTemplate getTemp() {
		JdbcTemplate temp= new JdbcTemplate(getDataSource());
		return temp;
	}

}
