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
	  public void beforeMethod() {//��ע�͵ķ�������ÿһ�����Է�������ǰ���С�
		  System.out.println("this is before method!!");
	  }

	  @AfterMethod
	  public void afterMethod() {//��ע�͵ķ�������ÿһ�����Է������ú����С�
		  System.out.println("this is after method!!");
	  }

	  @BeforeClass
	  public void beforeClass() {//ע��ķ�����ֻ����һ��,��ע�͵ķ������ڵ�ǰ��ĵ�һ�����Է�������ǰ���С�
		  System.out.println("this is before class!!");
	  }

	  @AfterClass
	  public void afterClass() {//ע��ķ�����ֻ����һ��,��ע�͵ķ������ڵ�ǰ������в��Է������ú����С�
		  System.out.println("this is after class!!");
	  }

	  @BeforeTest
	  public void beforeTest() {//ע��ķ�����������֮ǰ���κβ��Է��������ڲ���� <test>��ǩ�����С�
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
	  public void afterTest() {//ע��ķ����������к����еĲ��Է����������ڲ����<test>��ǩ�����С�
		  System.out.println("this is after test!!");
	  }

	  @BeforeSuite //ע��ķ�����ֻ����һ�Σ������ڴ��׼������в���ǰ
	  public void beforeSuite() {
		  System.out.println("this is before suite!!");
	  }

	  @AfterSuite //ע��ķ�����ֻ����һ�Σ������ڴ��׼������в���֮��
	  public void afterSuite() {
		  System.out.println("this is after suite!!");
	  }
}
