package com.harsha.spring.springmvc.daos;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.harsha.spring.springmvc.entities.UserEntities;

@Component
public class EntryDaoImpl implements EntryDao {
	
	@Autowired	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional(readOnly=false)
	public void save(UserEntities user) {
		hibernateTemplate.save(user);
	}

	@Transactional(readOnly=false)
	public void update(UserEntities user) {
		hibernateTemplate.update(user);

	}

	@Transactional(readOnly=false)
	public void delete(UserEntities user) {
		hibernateTemplate.delete(user);

	}

	
	public UserEntities findById(int id) {
		return hibernateTemplate.get(UserEntities.class, id);
	}

	
	public List<UserEntities> findAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(UserEntities.class);
	}


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public List<UserEntities> findByUserId(int id) {
		
		DetachedCriteria cri = DetachedCriteria.forClass(UserEntities.class);
		cri.add(Restrictions.eq("userid", id));
		List<UserEntities> uss =(List<UserEntities>) hibernateTemplate.findByCriteria(cri);
		return uss;
	}

}
