package com.harsha.spring.springmvc.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.harsha.spring.springmvc.busniess.EntryBusiness;
import com.harsha.spring.springmvc.busniess.HomeBusiness;
import com.harsha.spring.springmvc.entities.HomeEntities;
import com.harsha.spring.springmvc.entities.UserEntities;

@Controller
public class HomeController {
	
	@Autowired
	private HomeBusiness homeBusiness;
	
	@Autowired
	private EntryBusiness entryBusiness;
	
	@Autowired
	HttpSession session;
	
	public HomeBusiness getHomeBusiness() {
		return homeBusiness;
	}

	public void setHomeBusiness(HomeBusiness homeBusiness) {
		this.homeBusiness = homeBusiness;
	}

	@RequestMapping("/home")
	public ModelAndView HomePageMethod() {
		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		
		return model;
		
	}
	
	@RequestMapping("/register")
	public ModelAndView RegisterMethod() {
		ModelAndView model = new ModelAndView();
		model.setViewName("register");
		
		return model;
		
	}
	
	@RequestMapping("/login")
	public ModelAndView LoginMethod() {
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		
		return model;
		
	}
	
	@RequestMapping(value="/submitregistration", method=RequestMethod.POST)
	public ModelAndView submitRegistrationMethod(@ModelAttribute("homeEntities") HomeEntities home) {
		ModelAndView model = new ModelAndView();
		model.setViewName("submitregistration");
		homeBusiness.save(home);
		return model;
		
	}
	
	@RequestMapping(value="/authenticate", method=RequestMethod.POST)
	public ModelAndView submitLoginMethod(@ModelAttribute("homeEntities") HomeEntities home) {
		ModelAndView model = new ModelAndView();
		model.setViewName("submitlogin");
		HomeEntities home1 = homeBusiness.findByName(home.getUsername());
		if(home1!=null && home.getPassword().equals(home1.getPassword())){
			model.setViewName("sucesslogin");
			model.addObject("homeEntities", home1);
			session.setAttribute("homeEntities", home1);
			List<UserEntities> entities = null;
			try {
				entities=entryBusiness.findByUserId(home1.getId());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			model.addObject("entrieslist", entities);
		}
		
		return model;
		
	}
	
	@RequestMapping("/addentry")
	public ModelAndView addEntry() {
		ModelAndView model = new ModelAndView();
		model.setViewName("addentry");
		
		return model;
		
	}
	
	@RequestMapping("/final")
	public ModelAndView lastEntry(@ModelAttribute("userEntities") UserEntities user) {
		ModelAndView model = new ModelAndView();
		model.setViewName("sucesslogin");
		entryBusiness.save(user);
		
		HomeEntities home1 = (HomeEntities) session.getAttribute("homeEntities");
		List<UserEntities> entities = null;
		try {
			entities=entryBusiness.findByUserId(home1.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addObject("entrieslist", entities);
		return model;
		
	}
	
	@RequestMapping("/viewentry")
	public ModelAndView viewEntry(@RequestParam("id") int id) {
		ModelAndView model = new ModelAndView();
		model.setViewName("display");
		UserEntities user = entryBusiness.findById(id);
		model.addObject("userEntities",user);
		return model;
		
	}
	
	@RequestMapping("/homepage")
	public ModelAndView HomePagelnMethod() {
		ModelAndView model = new ModelAndView();
		model.setViewName("sucesslogin");
		HomeEntities home1 = (HomeEntities) session.getAttribute("homeEntities");
		List<UserEntities> entities = null;
		try {
			entities=entryBusiness.findByUserId(home1.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addObject("entrieslist", entities);
		return model;
		
	}
	
	@RequestMapping("/updateentry")
	public ModelAndView updateEntry(@RequestParam("id") int id) {
		ModelAndView model = new ModelAndView();
		model.setViewName("updateentry");
		UserEntities user = entryBusiness.findById(id);
		model.addObject("userEntities",user);
		return model;
		
	}
	
	@RequestMapping("/processentry")
	public ModelAndView processEntry(@ModelAttribute("userEntities") UserEntities user) {
		ModelAndView model = new ModelAndView();
		model.setViewName("sucesslogin");
		entryBusiness.update(user);
		
		HomeEntities home1 = (HomeEntities) session.getAttribute("homeEntities");
		List<UserEntities> entities = null;
		try {
			entities=entryBusiness.findByUserId(home1.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addObject("entrieslist", entities);
		return model;
		
	}
	
	@RequestMapping("/deleteentry")
	public ModelAndView deleteEntry(@RequestParam("id") int id) {
		ModelAndView model = new ModelAndView();
		model.setViewName("sucesslogin");
		UserEntities user = entryBusiness.findById(id);
		entryBusiness.delete(user);
		HomeEntities home1 = (HomeEntities) session.getAttribute("homeEntities");
		List<UserEntities> entities = null;
		try {
			entities=entryBusiness.findByUserId(home1.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addObject("entrieslist", entities);
		return model;
		
	}
	
	@RequestMapping("/signout")
	public ModelAndView signoutMethod() {
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		session.invalidate();
		return model;
		
	}
	

	public EntryBusiness getEntryBusiness() {
		return entryBusiness;
	}

	public void setEntryBusiness(EntryBusiness entryBusiness) {
		this.entryBusiness = entryBusiness;
	}
}
