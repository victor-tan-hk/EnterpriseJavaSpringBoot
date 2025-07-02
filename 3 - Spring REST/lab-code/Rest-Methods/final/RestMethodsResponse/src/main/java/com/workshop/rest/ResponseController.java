package com.workshop.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ResponseController {
  
  private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
  
  @Autowired
  Employee myEmployee;
  
  @Autowired
  Resume myResume;
  
//  There are 2 main ways to customize the HTTP status code
//  of the response returned
  
  
//  #1 Use the @ResponseStatus with HttpStatus
  
  @ResponseStatus(HttpStatus.ALREADY_REPORTED)
  @GetMapping("/status-one")
  public Resume firstStatus() {
    
    logger.info("firstStatus called");
    return myResume;
    
  }
  
//#2 Use the ResponseEntity class as the return type
// and customize its code with HttpStatus

  @GetMapping("/status-two")
  public ResponseEntity<Employee> secondStatus() {
    
    logger.info("secondStatus called");
    return new ResponseEntity<>(myEmployee, HttpStatus.MOVED_PERMANENTLY);
    
  }  

}

