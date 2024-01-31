package com.harsha.spring.springmvc.busniess;

import java.util.List;

import com.harsha.spring.springmvc.entities.HomeEntities;

public interface HomeBusiness {
	public void save(HomeEntities home);
	public void update(HomeEntities home);
	public void delete(HomeEntities home);
	public HomeEntities findById(int id);
	public List<HomeEntities> findAll();
	public HomeEntities findByName(String username);
}
