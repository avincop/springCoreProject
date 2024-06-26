package SpringJdbcInsert;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringJdbcInsert/operation.xml");
		JdbcTemplate temp = (JdbcTemplate) context.getBean("jdbcTemp");

		Emp emp = new Emp();
		emp.setId(101);
		emp.setName("Avinashh");
		emp.setCity("jaipur");
		/*
		 * String insertQuery="insert into emp values(?,?,?)"; int result=
		 * temp.update(insertQuery,emp.getId(),emp.getName(),emp.getCity());
		 * System.out.println(result);
		 */
		 
		/*
		 * String updateQuery = "update emp set name=?, city=? where id=?"; int result =
		 * temp.update(updateQuery, emp.getName(), emp.getCity(), emp.getId());
		 * System.out.println(result);
		 */
		
		/*
		 * String deleteQuery= "delete from emp where id=?"; int result=
		 * temp.update(deleteQuery, emp.getId()); System.out.println(result);
		 */
		
		//fatch indiudial date
		
		
		/*  String fatch= "select * from emp where id=?"; Emp test=
		  temp.queryForObject(fatch, new RowMapperImp(),emp.getId());
		  System.out.println(test);*/
		 
		  //all date fatch
		  
		  String fatch ="select * from emp";
		  List<Emp> test1=temp.query(fatch,new RowMapperImp() );
		  for(Emp data:test1) {
			  System.out.println(data);
		  }
		  

	}
}
