package com.example.dcc.Service;

import com.example.dcc.Repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

  private final TestRepository testRepository;

  @Autowired
  public TestService(TestRepository testRepository){
    this.testRepository = testRepository;
  }

}
