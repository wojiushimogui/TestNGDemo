package com.wrh.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class NewTest {
  @BeforeMethod
  public void beforeMethod() {//��ע�͵ķ�������ÿһ�����Է�������ǰ���С�
	  System.out.println("this is before method!!");
  }

  @AfterMethod
  public void afterMethod() {//��ע�͵ķ�������ÿһ�����Է������ú����С�
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

  @BeforeSuite //ע��ķ�����ֻ����һ�Σ������ڴ��׼������в���ǰ
  public void beforeSuite() {
	  System.out.println("this is before suite!!");
  }

  @AfterSuite //ע��ķ�����ֻ����һ�Σ������ڴ��׼������в���֮��
  public void afterSuite() {
	  System.out.println("this is after suite!!");
  }

}
