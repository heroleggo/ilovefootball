package com.heroleggo.ilovefootball.service.impl;

import com.heroleggo.ilovefootball.service.TestService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class ITestService implements TestService {

  @Override
  public Map<String, Object> getTestData() {
    Map<String, Object> data = new HashMap<>();

    data.put("1", "1");
    data.put("2", "2");
    data.put("3", "3");
    return data;
  }
}
