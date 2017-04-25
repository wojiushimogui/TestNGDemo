package com.wrh.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameter {
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("this is before method...");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("this is after method...");
	}
	
  @Test
  @Parameters("str")
  public void testParameter(String str) {
	  System.out.println("parameter is "+ str);
  }
  @Test
  @Parameters({"id","name"}) //�����������Ҫ{}�����������ڲ��������֮���ö��ŷֿ�
  public void testParameter2(int id,String name) {
	  System.out.println("id: "+ id +"  name:"+name );
  }
}
