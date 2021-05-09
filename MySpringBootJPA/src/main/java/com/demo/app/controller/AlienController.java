package com.demo.app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.app.dao.AlienRepo;
import com.demo.app.model.copy.Alien;

@Controller
public class AlienController 
{
	@Autowired				// This autowired will be responsible for creating the object and automatically link to controller
	AlienRepo repo;			// Creating a DAO interface Object of AlienRepo class
	
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")			// Creating a controller as per the Client side request/front page request
	public String addAlien(Alien alien)		//Pass the value a class/entity class
	{
		repo.save(alien);					// Saving the alien details into the Object of CRUD operation interface
		return "home.jsp";					// Returning the same view page or you can create anew view page as per requirement
	}
	
	@RequestMapping("/getAlien")		// Here the "getAlien" request getting from client or from jsp file		
	public ModelAndView addAlien(@RequestParam int aid)		// here we are accepting a "aid" not the whole object 	
	{
		
		ModelAndView mv= new ModelAndView("showAlien.jsp");	// Here the ModelView object constructor contains the view name
		Alien alien= repo.findById(aid).orElse(null);		// Here the Alien object will store the object details given by "repo" but as it may be null also so avoid error we are using an extra method ie. Orelse()				
		mv.addObject(alien);								// Here the alien object will be added to the ModelView Object and we will return the same modelView object
		return mv;										// Returning the model view object				
		
	}
	
	@RequestMapping("/updateAlien")
	public ModelAndView updateAlien(@RequestParam int aid, Alien alien)
	{
		ModelAndView mv=new ModelAndView("updateAlien.jsp");
		repo.deleteById(aid);									// This line will delete that particular row with matching id if the id is not there it will throw an exception
		repo.save(alien);									// Here the alien object will be given to save or update in the database
		mv.addObject(alien);								// Here I am storing the same alien details in the ModelandView object to return to the view
		
		return mv;
		
		
	}
	
	@RequestMapping("/techAlien")
	public ModelAndView techAlien(@RequestParam String tech)
	{
		
		
		ModelAndView mv=new ModelAndView("updateAlien.jsp");
		
		System.out.println(repo.findByTech(tech));			//Printing in console just for my reference
		return mv;
		
	}
	
	@RequestMapping("/nameAlien")
	public ModelAndView nameAlien(@RequestParam String aname)
	{
		ModelAndView mv= new ModelAndView("updateAlien.jsp");
		
		System.out.println(repo.findByFirstName(aname));
		return mv;
	}
	
}
