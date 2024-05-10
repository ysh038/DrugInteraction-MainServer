package com.example.dcc.Controller;

import com.example.dcc.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// origins 에 인자 안주고 전체 url을 허용하려했지만, 에뮬레이터에서 오류발생
@CrossOrigin(origins = {"http://localhost"})
@RestController
public class TestController {

  private final TestService testService;

  @Autowired
  public TestController(TestService testService){
    this.testService = testService;
  }

  @GetMapping("/test")
  public String TestFunction(){
    System.out.println("테스트 GetMapping 완료");
    return "테스트 성공 완료";
  }
//  위 테스트의 예외처리 하기
}
