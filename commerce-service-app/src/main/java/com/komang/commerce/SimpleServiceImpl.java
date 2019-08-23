package com.komang.commerce;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SimpleServiceImpl implements SimpleService {

  @Override
  public String get() {
    return "ABCD";
  }
}
