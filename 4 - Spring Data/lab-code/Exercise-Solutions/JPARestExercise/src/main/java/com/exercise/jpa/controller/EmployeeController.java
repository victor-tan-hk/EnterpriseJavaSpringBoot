package com.exercise.jpa.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.exercise.jpa.dto.EmployeeDTO;
import com.exercise.jpa.exception.IncorrectURLFormatException;
import com.exercise.jpa.service.EmployeeService;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
public class EmployeeController {
  
  @Autowired
  EmployeeService empService;
  
  @GetMapping("/employees")
  public List<EmployeeDTO> getAllEmployees() {
    
    log.info("/employees is invoked");
    return empService.getAllEmployees();
    
  }
  
  
  @PostMapping("/employees")
  public ResponseEntity<Object> addSingleDeveloper(@RequestBody EmployeeDTO empDTO) {
    
    log.info("POST /api/employees invoked");
    
    int devId = empService.saveEmployee(empDTO);
    URI location = ServletUriComponentsBuilder.fromCurrentRequest()
        .path("/{id}")
        .buildAndExpand(devId)
        .toUri();   
    return ResponseEntity.created(location).build();
    
  }  
  
  
  @PutMapping("/employees/{empIdString}")
  public void updateDeveloper(@PathVariable String empIdString, @RequestBody EmployeeDTO empDTO) {
    log.info("PUT /api/employees invoked");
    
    int devId = 0;
    try {
      devId = Integer.parseInt(empIdString);
    } catch (NumberFormatException ex) {
      throw new IncorrectURLFormatException("Employee id specified in path must be a number");
    }
    empService.updateEmployee(devId, empDTO);

  }
  
  
  @DeleteMapping("/employees/{empIdString}")
  public void deleteDeveloper(@PathVariable String empIdString) {

    log.info("DELETE /api/employees invoked");
    
    int empId = 0;
    try {
      empId = Integer.parseInt(empIdString);
    } catch (NumberFormatException ex) {
      throw new IncorrectURLFormatException("Employee id specified in path must be a number");
    }
    empService.deleteEmployee(empId);

  }
  
  
  

  

}
