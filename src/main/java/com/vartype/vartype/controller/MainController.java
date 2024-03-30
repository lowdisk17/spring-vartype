package com.vartype.vartype.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MainController {

  @GetMapping("service")
  public String getMethodName() {

      // int
      var i = 100;

      // long
      var l = 100l;

      // float
      var f = 1.7f;
 
      // double
      var d = 1.90;

      // char
      var c = 'a';

      // string
      var str = "tanu";

      // boolean
      var b = false;

      System.out.println("Value of integer is: " + i);
      System.out.println("Value of long is: " + l);
      System.out.println("Value of float is: " + f);
      System.out.println("Value of double is: " + d);
      System.out.println("Value of char is: " + c);
      System.out.println("Value of string is: " + str);
      System.out.println("Value of boolean is: " + b);

      return "Done";
  }
  
}
