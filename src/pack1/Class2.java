package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class2 {
  @Test
  public void Test3() {
	  System.out.println("I am in Method 3");
  }
  @Test
  public void Test4() {
	  Assert.fail("I am fail");
	  System.out.println("I am in Method 4");
  }
}
