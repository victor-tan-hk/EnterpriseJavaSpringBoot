package com.exercise.rest;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
  
}

