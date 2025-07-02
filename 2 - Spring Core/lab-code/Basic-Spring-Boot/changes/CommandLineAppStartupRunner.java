package com.workshop.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
  
  @Autowired
  MathStudent mathStudent;
  
  @Autowired
  HighSchoolStudent highSchoolStudent;


    @Override
    public void run(String...args) throws Exception {
      
      System.out.println ("Displaying command line arguments");
      int i = 1;
      for (String s : args) {
        System.out.println ("Arg " + (i++) + " : " + s);
      }
      System.out.println ("output from mathstudent");
      mathStudent.dailyActivity();
      System.out.println ("output from highschoolstudent");
      highSchoolStudent.dailyActivity();

    }
}