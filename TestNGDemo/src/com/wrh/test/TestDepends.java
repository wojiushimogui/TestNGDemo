package com.wrh.test;

import org.testng.annotations.Test;

public class TestDepends {
  @Test(dependsOnMethods="other")//�����͵���other�������������֮ǰ����
  public void f() {
	  System.out.println("this method depend on other method...");
  }
  
  @Test
  public void other(){
	  System.out.println("this method name is other....");
  }
}
