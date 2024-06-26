package main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import main.entity.StudentEntity;

@Component
public class DaoClassImp implements DaoClass{

	@Autowired
	private JdbcTemplate temp;
	@Override
	public int saveUserData(StudentEntity entity) {
		String query="insert into emp values(?,?,?)";
	  return temp.update(query,entity.getId(),entity.getName(),entity.getCity());
	}

}
