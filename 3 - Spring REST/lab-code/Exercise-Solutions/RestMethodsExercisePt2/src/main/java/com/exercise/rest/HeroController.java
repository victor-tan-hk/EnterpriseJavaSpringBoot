package com.exercise.rest;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class HeroController {
  
  private static final Logger logger = LoggerFactory.getLogger(HeroController.class);
  
  @Autowired
  ArrayList<Hero> myHeroes;
  
  @GetMapping("/heroes")
  public List<Hero> getAllHeroes() {
    
    logger.info("GET api/heroes invoked");
    return myHeroes;
    
  }
  
  
  @PostMapping("/heroes")
  public void addSingleHero(@RequestBody Hero hero) {
    
    logger.info("POST /api/heroes invoked");
    
    myHeroes.add(hero);
    
  }
  
  @GetMapping("/heroes/{heroName}")
  public Hero locateHerobyHeroName(@PathVariable String heroName) {
  	
    logger.info("Get mapping for hero name : " + heroName);

  	for (Hero hero : myHeroes) {
  		if (hero.getName().equalsIgnoreCase(heroName))
  			return hero;
  	}
  	
  	return null;
  }
  
  @GetMapping("/heroes/{itemToSearch}/{itemValue}")
  public Hero locateHeroByAgeOrSuperpower(@PathVariable String itemToSearch, @PathVariable String itemValue) {
  	
    logger.info("Searching for hero by field : " + itemToSearch + " for value : " + itemValue);
     

  	for (Hero hero : myHeroes) {
  		if (itemToSearch.equals("age") && hero.getAge() == Integer.parseInt(itemValue))
  			return hero;
  		else if (itemToSearch.equals("superpower") && hero.getSuperPower().equalsIgnoreCase(itemValue))
  			return hero;
  	}
  	
  	return null;
  }  

  
  
  @GetMapping("/heroparams")
  public Hero getByNameOrAge(@RequestParam String name, @RequestParam(required = false) String age) {
  	
  	for (Hero hero : myHeroes) {
  		if (hero.getName().equalsIgnoreCase(name)) {
  			if (age != null) {
  				if (hero.getAge() == Integer.parseInt(age))
  					return hero;
  				else
  					return null;
  			}
  			else
  				return hero;
  		}
  	}
  	
  	
  	return null;
  	
  }
  
  
  @PutMapping("/heroes")
  public void putSingleHero(@RequestBody Hero heroToChange)
  {
  	for (Hero hero : myHeroes) {
  		if (hero.getName().equalsIgnoreCase(heroToChange.getName()))
  			hero.setAge(heroToChange.getAge());
  			hero.setSuperPower(heroToChange.getSuperPower());
  	}
  }

  @DeleteMapping("/heroes/{heroName}")
  public void deleteSingleHeroByName(@PathVariable String heroName) {
  	
    logger.info("Delete mapping for hero name : " + heroName);
    
    for (int i = 0; i < myHeroes.size(); i++) {
    	if (myHeroes.get(i).getName().equalsIgnoreCase(heroName)) {
    		myHeroes.remove(i);
    		break;
    	}
    }

  	
  }
  
  
}

