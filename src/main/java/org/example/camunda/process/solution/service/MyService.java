package org.example.camunda.process.solution.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

  public String myOperation(String businessKey) {
    return businessKey;
  }
}
