package com.wrh.test;

import org.testng.annotations.Test;

public class TestNGIgnore {
  @Test(enabled=false) //ºöÂÔ
  public void f() {
	  System.out.println("this is a ignore...");
  }
  @Test
  public void test(){
	  System.out.println("this is a test...");
  }
}
