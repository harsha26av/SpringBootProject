package com.harsha.spring.springmvc.daos;

import java.util.List;

import com.harsha.spring.springmvc.entities.UserEntities;

public interface EntryDao {
	public void save(UserEntities user);
	public void update(UserEntities user);
	public void delete(UserEntities user);
	public UserEntities findById(int id);
	public List<UserEntities> findAll();
	public List<UserEntities> findByUserId(int id);
}
