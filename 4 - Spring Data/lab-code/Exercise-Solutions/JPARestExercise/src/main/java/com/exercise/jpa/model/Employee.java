package com.exercise.jpa.model;

import java.time.LocalDate;

import com.exercise.jpa.dto.EmployeeDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name="employees")
public class Employee {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  private String name;
  private Integer age;
  private Character gender;
  private LocalDate hire_date;
  private Float salary;
  
  public Employee(EmployeeDTO empDTO) {
  	this.name = empDTO.getName();
  	this.age = empDTO.getAge();
  	this.gender = empDTO.getGender();
  	this.hire_date = empDTO.getHire_date();
  	this.salary = empDTO.getSalary();
  }
  
}
