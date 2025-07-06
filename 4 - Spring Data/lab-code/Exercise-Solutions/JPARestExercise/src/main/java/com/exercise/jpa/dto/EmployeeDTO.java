package com.exercise.jpa.dto;

import java.time.LocalDate;

import com.exercise.jpa.model.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class EmployeeDTO {
  
  private Integer id;
  private String name;
  private Integer age;
  private Character gender;
  private LocalDate hire_date;
  private Float salary;  
  
  public EmployeeDTO(Employee emp) {
    this.id = emp.getId();
    this.name = emp.getName();
    this.age = emp.getAge();
    this.gender = emp.getGender();
    this.hire_date = emp.getHire_date();
    this.salary = emp.getSalary();

  }

}
