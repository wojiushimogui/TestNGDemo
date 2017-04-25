package com.wrh.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class NewTest {
  @BeforeMethod
  public void beforeMethod() {//被注释的方法将在每一个测试方法调用前运行。
	  System.out.println("this is before method!!");
  }

  @AfterMethod
  public void afterMethod() {//被注释的方法将在每一个测试方法调用后运行。
	  System.out.println("this is after method!!");
  }

  
  @Test
  public void testNGLearn() {
      System.out.println("this is testNG test case one!!!");
  }
  
  @Test
  public void testNGLearn2(){
	  System.out.println("this is testNG test case two!!!");
  }

  @BeforeSuite //注解的方法将只运行一次，运行在此套件中所有测试前
  public void beforeSuite() {
	  System.out.println("this is before suite!!");
  }

  @AfterSuite //注解的方法将只运行一次，运行在此套件中所有测试之后
  public void afterSuite() {
	  System.out.println("this is after suite!!");
  }

}
