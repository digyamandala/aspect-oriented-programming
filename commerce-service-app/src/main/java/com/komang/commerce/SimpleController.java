package com.komang.commerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

  private SimpleService simpleService;

  @Autowired
  public SimpleController(SimpleService simpleService) {
    this.simpleService = simpleService;
  }

  @GetMapping("/test")
  @Validate
  public String test(@RequestParam String a) {

    return "Test, " + a + " " + simpleService.get();
  }
}
