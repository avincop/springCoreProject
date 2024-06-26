package SpringJdbcInsert;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImp implements RowMapper<Emp> {

	@Override
	public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
		Emp emp= new Emp();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setCity(rs.getString(3));
		return emp;
		
		
	}

}
