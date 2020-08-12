package ssc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class MainTestNG {
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("²âÊÔ¿ªÊ¼");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("²âÊÔ½áÊø");
  }

  @Test
  public void testShowMenu() {
      Main main = new Main();
      main.showMenu();
  }

}
