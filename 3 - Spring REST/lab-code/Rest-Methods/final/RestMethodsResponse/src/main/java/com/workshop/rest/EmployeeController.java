package com.workshop.rest;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class EmployeeController {
  
  private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
  
  @Autowired
  Employee myEmployee;
  
  @Autowired
  Resume myResume;
  
  @GetMapping("/employee")
  public Employee getSingleEmployee() {
    
    logger.info("GetMapping for employee");
    return myEmployee;
    
  }
  
	//  Here we specify the content type to be returned in the response 
	//  body as JSON, but we don't need to do this explicitly since the 
	//  default content type for REST API is already JSON
  @GetMapping(path = "/resume", produces = "application/json")
  public Resume getSingleResume() {
    
    logger.info("GetMapping for resume");
    return myResume;
    
  }
  
//  Below are 2 handler methods that map to the same API endpoint
//  but return different content (XML or JSON), which will depend
//  on the Accept header of the HTTP GET request
  
  @GetMapping(path = "/both",produces = { MediaType.APPLICATION_XML_VALUE })
  public Resume returnOnlyXML() {
    
    logger.info("GetMapping method that returns XML");
    return myResume;
    
  }
  
  @GetMapping(path = "/both",produces = { MediaType.APPLICATION_JSON_VALUE })
  public Resume returnOnlyJSON() {
    
    logger.info("GetMapping method that returns JSON");
    return myResume;
    
  }  
  
//  This handler method can process incoming content in either JSON or XML format
//  This XML / JSON content is deserialized into the object res that is bound
//  with the @RequestBody annotation

  @PostMapping(path = "/resume", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
  public void mapSingleEmployee(@RequestBody Resume res)
  {
    
    logger.info("PostMapping for resume");
    logger.info(res.toString());
  }  
  
  @PostMapping("/employee")
  public void mapSingleEmployee(@RequestBody Employee emp)
  {
    
    logger.info("PostMapping for employee");
    logger.info(emp.toString());
  }
  
	//  To process POST requests in this format, we need to use @RequestParam
	//  and bind to a Map object
  @PostMapping(path="/vals", consumes = "application/x-www-form-urlencoded")
  public void process(@RequestParam Map<String,String> paramValues) {
    
    logger.info("PostMapping for values");
    for (Map.Entry<String, String> entry : paramValues.entrySet())
      logger.info("Key = " + entry.getKey() + ", Value = " + entry.getValue());

  }    
  
  
  @PutMapping("/resume")
  public void putSingleResume(@RequestBody Resume res)
  {
    logger.info("PutMapping for resume");
    logger.info(res.toString());
  }
  
	//  Handler method for DELETE requests do not need @RequestBody
	//  since we are deleting a specific resource corresponding to the API endpoint
  @DeleteMapping("/resume")
  public void deleteSingleResume()
  {
    logger.info("DeleteMapping for resume");
  }

}

