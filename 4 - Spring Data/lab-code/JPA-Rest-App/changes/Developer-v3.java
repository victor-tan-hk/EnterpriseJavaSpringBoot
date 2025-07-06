package com.workshop.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import com.workshop.jpa.dto.DeveloperDTO;

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
@Table(name="developers")
public class Developer {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  private String name;
  private Integer age;
  private String languages;
  private Boolean married;
  
  public Developer (DeveloperDTO devDTO) {
    
    this.name = devDTO.getName();
    this.age = devDTO.getAge();
    String langToStore = "";
    for (String lang : devDTO.getLanguages()) {
      langToStore += lang + ",";
    }
    this.languages = langToStore.substring(0,langToStore.length()-1);
    this.married = devDTO.getMarried();
  }
  
}
