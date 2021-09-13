package com.Spring.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import io.micrometer.core.annotation.Timed;

@RestController
public class AuthenticationController {

  @RequestMapping(value = { "/login" }, method = RequestMethod.GET)
  public ModelAndView login() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("login"); // resources/template/login.html
    return modelAndView;
  }
  @RequestMapping(value = "/home", method = RequestMethod.GET)
  public ModelAndView home() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("home"); // resources/template/home.html
    return modelAndView;
  }

}
