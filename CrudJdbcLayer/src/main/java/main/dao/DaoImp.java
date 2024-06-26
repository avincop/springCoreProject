package main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import main.entity.EmpEntity;
@Component("dao")
public class DaoImp implements DaoLayer {
  @Autowired
	private JdbcTemplate temp;
	@Override
	public int saveUserData(EmpEntity entity) {
		String insert ="insert into emp values(?,?,?)";
		return temp.update(insert,entity.getId(),entity.getName(),entity.getCity());
		
	}

}
