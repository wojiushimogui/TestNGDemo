package com.wrh.test;

import org.testng.annotations.Test;

public class TestDepends {
  @Test(dependsOnMethods="other")//这样就导致other方法在这个方法之前运行
  public void f() {
	  System.out.println("this method depend on other method...");
  }
  
  @Test
  public void other(){
	  System.out.println("this method name is other....");
  }
}
