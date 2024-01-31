package com.harsha.spring.springmvc.busniess;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.harsha.spring.springmvc.daos.HomeDao;
import com.harsha.spring.springmvc.entities.HomeEntities;

@Component
public class HomeBusinessImpl implements HomeBusiness {

	@Autowired
	private HomeDao homeDao; 
	
	public void save(HomeEntities home) {
		homeDao.save(home);
	}


	public void update(HomeEntities home) {
		// TODO Auto-generated method stub
		homeDao.update(home);
	}

	
	public void delete(HomeEntities home) {
		// TODO Auto-generated method stub
		homeDao.delete(home);
	}


	public HomeEntities findById(int id) {
		return homeDao.findById(id);
	}

	
	public List<HomeEntities> findAll() {
		// TODO Auto-generated method stub
		return homeDao.findAll();
	}


	public HomeDao getHomeDao() {
		return homeDao;
	}


	public void setHomeDao(HomeDao homeDao) {
		this.homeDao = homeDao;
	}


	@Override
	public HomeEntities findByName(String username) {
		
		return homeDao.findByName(username);
	}

}
