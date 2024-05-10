package com.example.dcc.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(Exception.class)
  public ResponseEntity<String> handleException(Exception ex) {
    // 예외 처리 로직을 작성합니다.
    // 예를 들어, 로깅하거나 사용자에게 적절한 에러 메시지를 제공합니다.
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred: " + ex.getMessage());
  }

  // 다른 예외를 처리하기 위해 추가적인 @ExceptionHandler 메서드를 정의할 수 있습니다.
}
