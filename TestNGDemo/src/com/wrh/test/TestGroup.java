package com.wrh.test;

import org.testng.annotations.Test;

public class TestGroup {
  @Test(groups = {"loginGroup"})
  public void testLogin() {
	  System.out.println("this is tes login in loginGroup...");
  }
  @Test(groups = {"signUpGroup"})
  public void testSignUp(){
	  System.out.println("this is test sign up in signUpGroup...");
  }
}
