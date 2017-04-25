package com.wrh.test;

import org.testng.annotations.Test;

public class TestException {
  @Test(expectedExceptions=IllegalArgumentException.
		  class,expectedExceptionsMessageRegExp="nullPointException")
  public void testExcepiton(){
	  throw new IllegalArgumentException("nullPointException");
  }
}
