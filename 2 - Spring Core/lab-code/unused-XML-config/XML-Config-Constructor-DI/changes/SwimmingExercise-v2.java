package com.workshop.configdi;

import java.util.List;
import java.util.Map;

public class SwimmingExercise implements Exercise {

  private List<String> swimmingStrokes;
  private Map<String,Integer> competitionPositions;  
  
  public SwimmingExercise() {
    
  }
  
  public SwimmingExercise(List<String> swimmingStrokes, Map<String, Integer> competitionPositions) {
    this.swimmingStrokes = swimmingStrokes;
    this.competitionPositions = competitionPositions;
  }


  @Override
  public void doExercise() {

    System.out.println ("Swimming strokes used");
    for (String stroke: swimmingStrokes) {
      System.out.println ("Stroke : " + stroke);
    }
    
    System.out.println ("\nPositions in competitions");
    for (Map.Entry<String,Integer> competition : competitionPositions.entrySet()) {
      System.out.println("Competition : " + competition.getKey() + ", Position = " + competition.getValue());    
    }
    
    
  }

}

