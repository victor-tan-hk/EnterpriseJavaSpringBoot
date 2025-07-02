package com.workshop.demo;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
  
  @Bean
  public Random getRandomGenerator() {
    System.out.println ("getRandomGenerator called");
    Random r = new Random();
    r.setSeed(888L);
    return r;
  }

}
