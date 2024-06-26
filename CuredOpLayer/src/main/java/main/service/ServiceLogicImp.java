package main.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.dao.DaoClassImp;
import main.entity.StudentEntity;

@Component("service")
public class ServiceLogicImp implements ServiceLogic{

	@Autowired
	private DaoClassImp dao;
	@Override
	public int saveData(StudentEntity entity) {
		return dao.saveUserData(entity);
	}

}