package com.workshop.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ThirdController {

  private static final Logger LOGGER = 
      LoggerFactory.getLogger(ThirdController.class);

  @GetMapping("/processFirstForm")
  public String showGetPage() {
    
    LOGGER.info("Inside showGetPage in ThirdController");

    return "cool";
  }

  @PostMapping("/processFirstForm")
  public String showPostPage() {
    
    LOGGER.info("Inside showPostPage in ThirdController");

    return "fancy";
  }

}
