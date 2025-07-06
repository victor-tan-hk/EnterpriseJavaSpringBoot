package com.exercise.jpa.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.exercise.jpa.model.Employee;


public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer>, CrudRepository<Employee, Integer>  {

	// Returns the last row in the table
	@Query(value = "SELECT * FROM employees ORDER BY id DESC LIMIT 1", 
			nativeQuery = true)
	List<Employee> getNewlyAddedRecord();	

	// Update existing row in the table by its id
	@Modifying
	@Transactional
	@Query(value = "UPDATE employees SET name = :empName, age = :empAge, gender = :empGender, hire_date = :empHire_date, salary = :empSalary WHERE id = :empId", 
	nativeQuery = true)

	void updateExistingRecord(@Param("empId") int empId, @Param("empName") String empName, @Param("empAge") Integer empAge, @Param("empGender") Character empGender, @Param("empHire_date") LocalDate hire_date, @Param("empSalary") Float empSalary);               


}