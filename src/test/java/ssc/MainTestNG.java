package ssc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class MainTestNG {
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("���Կ�ʼ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("���Խ���");
  }

  @Test
  public void testShowMenu() {
      Main main = new Main();
      main.showMenu();
  }

}
