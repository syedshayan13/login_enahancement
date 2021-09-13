package com.Spring.login.controller;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AuthenticationControllerTest {

  @Autowired
  private AuthenticationController auth_C;

  @Test
  void contextLoadWithController() throws Exception {
    assertThat(auth_C).isNotNull();
  }
}
