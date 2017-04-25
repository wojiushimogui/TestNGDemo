package com.wrh.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest2 {
	  @BeforeMethod
	  public void beforeMethod() {//被注释的方法将在每一个测试方法调用前运行。
		  System.out.println("this is before method!!");
	  }

	  @AfterMethod
	  public void afterMethod() {//被注释的方法将在每一个测试方法调用后运行。
		  System.out.println("this is after method!!");
	  }

	  @BeforeClass
	  public void beforeClass() {//注解的方法将只运行一次,被注释的方法将在当前类的第一个测试方法调用前运行。
		  System.out.println("this is before class!!");
	  }

	  @AfterClass
	  public void afterClass() {//注解的方法将只运行一次,被注释的方法将在当前类的所有测试方法调用后运行。
		  System.out.println("this is after class!!");
	  }

	  @BeforeTest
	  public void beforeTest() {//注解的方法将被运行之前的任何测试方法属于内部类的 <test>标签的运行。
		  System.out.println("this is before test!!");
	  }
	  
	  @Test
	  public void testNGLearn() {
	      System.out.println("this is testNG test case one!!!");
	  }
	  
	  @Test
	  public void testNGLearn2(){
		  System.out.println("this is testNG test case two!!!");
	  }
	  @Test
	  public void testNGLearn3(){
		  System.out.println("this is testNG test case three!!!");
	  }

	  @AfterTest
	  public void afterTest() {//注解的方法将被运行后，所有的测试方法，属于内部类的<test>标签的运行。
		  System.out.println("this is after test!!");
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
