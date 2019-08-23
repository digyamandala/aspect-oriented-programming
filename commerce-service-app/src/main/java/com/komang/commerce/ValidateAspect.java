package com.komang.commerce;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class ValidateAspect {

  @Before("@annotation(Validate)")
  public void log(JoinPoint joinPoint) {

    log.info("Test");
  }
}
