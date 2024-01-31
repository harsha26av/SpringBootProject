package com.harsha.spring.springmvc.busniess;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.harsha.spring.springmvc.daos.EntryDao;
import com.harsha.spring.springmvc.entities.UserEntities;

@Component
public class EntryBusinessImpl implements EntryBusiness {
	@Autowired
	private EntryDao entryDao;
	
	public void save(UserEntities user) {
		// TODO Auto-generated method stub
		entryDao.save(user);
	}

	
	public void update(UserEntities user) {
		// TODO Auto-generated method stub
		entryDao.update(user);
	}


	public void delete(UserEntities user) {
		// TODO Auto-generated method stub
		entryDao.delete(user);
	}

	
	public UserEntities findById(int id) {
		// TODO Auto-generated method stub
		return entryDao.findById(id);
	}

	
	public List<UserEntities> findAll() {
		// TODO Auto-generated method stub
		return entryDao.findAll();
	}


	public EntryDao getEntryDao() {
		return entryDao;
	}


	public void setEntryDao(EntryDao entryDao) {
		this.entryDao = entryDao;
	}


	@Override
	public List<UserEntities> findByUserId(int id) {
		// TODO Auto-generated method stub
		return entryDao.findByUserId(id);
	}

}
