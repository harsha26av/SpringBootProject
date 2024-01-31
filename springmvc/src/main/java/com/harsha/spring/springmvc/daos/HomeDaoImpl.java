package com.harsha.spring.springmvc.daos;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.harsha.spring.springmvc.entities.HomeEntities;

@Component
public class HomeDaoImpl implements HomeDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional(readOnly=false)
	public void save(HomeEntities home) {
		hibernateTemplate.save(home);

	}

	@Transactional(readOnly=false)
	public void update(HomeEntities home) {
		hibernateTemplate.update(home);

	}

	@Transactional(readOnly=false)
	public void delete(HomeEntities home) {
		hibernateTemplate.delete(home);

	}


	public HomeEntities findById(int id) {
		
		return hibernateTemplate.get(HomeEntities.class, id);
	}

	
	public List<HomeEntities> findAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(HomeEntities.class);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public HomeEntities findByName(String username) {
		DetachedCriteria criteria  = DetachedCriteria.forClass(HomeEntities.class);
		criteria.add(Restrictions.eq("username", username));
		HomeEntities home= null;
		try {
			home=(HomeEntities) hibernateTemplate.findByCriteria(criteria).get(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("User not found");
		}
		
		return home;
	}

}
