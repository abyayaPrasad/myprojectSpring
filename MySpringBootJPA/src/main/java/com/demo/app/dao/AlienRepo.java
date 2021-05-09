package com.demo.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.demo.app.model.copy.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer>	//This interface extended one marker interface and we gave the Entity class name and Primary key type in seoond value
{

	
	List<Alien> findByTech(String tech);		//Here the findBy should be constant and continued by an Property name/coulmn name
	
	
	@Query("from Alien where aname=?1")			//If you want to write some complex query you can use it here but that should be in JQL format
	List<Alien> findByFirstName(String aname);	// Here new function declared 
	
}
