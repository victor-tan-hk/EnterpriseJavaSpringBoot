package com.workshop.configdi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoCollectionsUse {

  public static void main(String[] args) {
    
    List<String> animals = new ArrayList<String>();
    animals.add("cat");
    animals.add("dog");
    animals.add("rabbit");
    
    System.out.println ("List of animals : ");
    for (String animal : animals) {
      System.out.println(animal);
    }
    
    Map<String, Integer> persons = new HashMap<String, Integer>(); 
    persons.put("Mark", 30);
    persons.put("James", 20);
    persons.put("Susie", 50);

    System.out.println ("List of people and their ages : ");
    for (String name : persons.keySet())
      System.out.println(name + " - " + persons.get(name));
    System.out.println();
    
    
  }

}
