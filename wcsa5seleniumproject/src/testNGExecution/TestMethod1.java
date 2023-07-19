package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod1 {
  @Test
  public void testmethod1() 
  {
	  long threadId1 = Thread.currentThread().getId();
	  
	  Reporter.log("thread id of testmethod1 :"+threadId1,true);
  }
  
  @Test
  public void testmethod2() 
  {
	  long threadId1 = Thread.currentThread().getId();
	  
	  Reporter.log("thread id of testmethod2 :"+threadId1,true);
  }
}
