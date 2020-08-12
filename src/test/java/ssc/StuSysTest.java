package ssc;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class StuSysTest {

	StuSys stuSys = new StuSys();
    Scanner sc = new Scanner(System.in);

    @Before
    public void setUp() throws Exception {
        System.out.println("≤‚ ‘ø™ º");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("≤‚ ‘Ω· ¯");
    }

    @Test
    public void insertStu() {
        stuSys.insertStu(sc);
    }

    @Test
    public void delateStu() {
        stuSys.delateStu(sc);
    }

    @Test
    public void updateStu() {
        stuSys.updateStu(sc);
    }

    @Ignore
    public void showStuInfo() {
        stuSys.showStuInfo(sc);
    }

    @Test
    public void showAllStuInfo() {
        stuSys.showAllStuInfo();
    }


}
