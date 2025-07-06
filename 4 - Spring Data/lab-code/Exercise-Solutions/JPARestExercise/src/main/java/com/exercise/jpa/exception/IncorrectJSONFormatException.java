package com.exercise.jpa.exception;

public class IncorrectJSONFormatException extends RuntimeException {
  
  public IncorrectJSONFormatException(String message) {
    super(message);
  }


}