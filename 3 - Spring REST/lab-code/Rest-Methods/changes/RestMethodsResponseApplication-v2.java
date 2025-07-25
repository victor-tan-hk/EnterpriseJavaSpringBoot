package com.workshop.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestMethodsResponseApplication {
  
  @Bean
  public Employee employee() {
    Employee myEmployee = new Employee("Thor", 300, false, resume());
    return myEmployee;
  }

  @Bean
  public Resume resume() {

    String[] spokenLanguages = {"English","French","Japanese"};
    Resume myResume = new Resume("Harvard",3.55f, spokenLanguages, "Awesome Developer", 5);
    return myResume;
  
  }  
  
  @Bean
  public FilterRegistrationBean<AddResponseHeaderFilter> loggingFilter(){
    FilterRegistrationBean<AddResponseHeaderFilter> registrationBean 
      = new FilterRegistrationBean<>();
        
    registrationBean.setFilter(new AddResponseHeaderFilter());
    //Specifying which API endpoint paths that the filter will automatically 
    //activate on
    registrationBean.addUrlPatterns("/api/filter-header/*");
        
    return registrationBean;    
  }
  

	public static void main(String[] args) {
		SpringApplication.run(RestMethodsResponseApplication.class, args);
	}

}
