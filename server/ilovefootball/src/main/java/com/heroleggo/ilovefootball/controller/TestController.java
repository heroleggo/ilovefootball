package com.heroleggo.ilovefootball.controller;

import com.heroleggo.ilovefootball.service.TestService;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

  @Autowired
  private final TestService testService;

  @GetMapping("/test")
  public Map<String, Object> TestController() {
    return testService.getTestData();
  }
}
