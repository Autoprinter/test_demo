package ssc;

import java.util.Scanner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StuSysTestNG {

	 @BeforeMethod
	    public void setUp() {
	        System.out.println("≤‚ ‘ø™ º");
	    }

	    @AfterMethod
	    public void tearDown() {
	        System.out.println("≤‚ ‘Ω· ¯");
	    }

	    StuSys sys = new StuSys();
	    Scanner sc = new Scanner(System.in);

	    @Test
	    public void testInsertStu() {
	        sys.insertStu(sc);
	    }

	    @Test
	    public void testDelateStu() {
	        sys.delateStu(sc);
	    }

	    @Test
	    public void testUpdateStu() {
	        sys.updateStu(sc);
	    }

	    @Test
	    public void testShowStuInfo() {
	        sys.showStuInfo(sc);
	    }

	    @Test
	    public void testShowAllStuInfo() {
	        sys.showAllStuInfo();
	    }

}
