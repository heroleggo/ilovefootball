package com.heroleggo.ilovefootball.service;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public interface TestService {
  Map<String, Object> getTestData();
}
