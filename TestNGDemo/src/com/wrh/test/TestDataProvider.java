package com.wrh.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("this is before method...");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("this is after method...");
	}
	
	  @Test(dataProvider = "user")
	  public void testDataProvider(int id, String name) {
		  System.out.println("id: "+id +"  name: " + name+"....");
	  }
	
	  @DataProvider(name="user")
	  public Object[][] users() {//有多少组参数，就调用多少次testDataProvider方法
	    return new Object[][] {
	      new Object[] { 1, "xiaoming" },
	      new Object[] { 2, "wuranghao" },
	    };
	  }
  
}
