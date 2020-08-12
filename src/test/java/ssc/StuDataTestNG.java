package ssc;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.junit.Assert.assertNotNull;


public class StuDataTestNG {

	 @BeforeMethod
	    public void setUp() {
	        System.out.println("≤‚ ‘ø™ º");
	    }

	    @AfterMethod
	    public void tearDown() {
	        System.out.println("≤‚ ‘Ω· ¯");
	    }

	    StuData std = new StuData();
	    byte a = 23;
	    Student stu = new Student("SX1916025","ÀÔ À≥§","ƒ–",a,100);

	    @Test
	    public void testInsertStu() {
	        std.insertStu(stu);
	    }

	    @Test
	    public void testCheckStuNo() {
	        std.insertStu(stu);
	        Student stu = std.checkStuNo("SX1916025");
	        assertNotNull(stu);
	    }

	    @Test
	    public void testDelateStu() {
	        std.delateStu("SX1916025");
	    }

	    @Test
	    public void testUpdateStu() {
	        std.updateStu(stu);
	    }

	    @Test
	    public void testPrintStu() {
	        std.printStu(stu);
	    }

	    @Test
	    public void testPrintAllstuInf() {
	        std.printAllstuInf();
	    }

}
