package main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.dao.DaoLayer;
import main.entity.EmpEntity;
@Component("service")
public class ServiceImp implements ServiceLayer{
   @Autowired
	private DaoLayer dao;
	@Override
	public int saveData(EmpEntity entity) {
		return dao.saveUserData(entity);
		
	}

}
