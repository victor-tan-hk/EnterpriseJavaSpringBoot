package com.exercise.jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Sort;

import com.exercise.jpa.dto.EmployeeDTO;
import com.exercise.jpa.exception.IncorrectJSONFormatException;
import com.exercise.jpa.exception.IncorrectURLFormatException;
import com.exercise.jpa.model.Employee;
import com.exercise.jpa.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	public List<EmployeeDTO> getAllEmployees() {

		List<EmployeeDTO> myEmps = new ArrayList<EmployeeDTO>();
		Iterable<Employee> empList = empRepo.findAll(Sort.by(Sort.Direction.ASC, "id"));
		log.info("Retrieved employees from database");
		for (Employee emp : empList) {
			myEmps.add(new EmployeeDTO(emp));
		}

		return myEmps;
	}



	public int saveEmployee(EmployeeDTO empDTO) {

		if (isEmployeeValid(empDTO)) {
			Employee newEmp = new Employee(empDTO);
			empRepo.save(newEmp);
		}
		else 
			throw new IncorrectJSONFormatException("JSON is valid, but incorrect format for employee");

		List<Employee> devs = empRepo.getNewlyAddedRecord();
		int newDevId = devs.get(0).getId();
		return newDevId;

	}


  
  public void updateEmployee(int empId, EmployeeDTO empDTO) {
    
    if (isEmployeeValid(empDTO)) {
      Employee newEmp = new Employee(empDTO);
      if (!empRepo.existsById(empId))
        throw new IncorrectURLFormatException("Employee with id : " + empId + " does not exist");
      
      log.info("Updating employee id : "+ empId);
      log.info("With new contents : " + newEmp.toString());

      empRepo.updateExistingRecord(empId, newEmp.getName(), newEmp.getAge(), 
      		newEmp.getGender(), newEmp.getHire_date(), newEmp.getSalary());
   
      
    }
    else 
      throw new IncorrectJSONFormatException("JSON is valid, but incorrect format for developer");
  
  }
  
  
  public void deleteEmployee(int empId) {
    
      if (!empRepo.existsById(empId))
        throw new IncorrectURLFormatException("Employee with id : " + empId + " does not exist");
      
      log.info("Deleting employee id : "+ empId);

      empRepo.deleteById(empId);
    
  }
  	
	
	
	private boolean isEmployeeValid(EmployeeDTO empDTO) {

		return (empDTO.getName() != null &&
				empDTO.getAge() != null &&
				empDTO.getGender() != null &&
				empDTO.getHire_date() != null &&        
				empDTO.getSalary() != null);
	}


}
