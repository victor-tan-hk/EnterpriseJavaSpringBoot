package com.workshop.configdi;

public class CyclingExercise implements Exercise {
  
  private String cyclingTechnique;
  private int cyclingSpeed;
  private boolean onRoad;
  
  
  public CyclingExercise(String cyclingTechnique, int cyclingSpeed, boolean onRoad) {
    this.cyclingTechnique = cyclingTechnique;
    this.cyclingSpeed = cyclingSpeed;
    this.onRoad = onRoad;
  }


  @Override
  public void doExercise() {
    System.out.println ("Cycling technique is : " + cyclingTechnique);
    System.out.println ("Cycling speed is : " + cyclingSpeed);
    System.out.println ("Cycling on the road : " + onRoad);
  }


}
