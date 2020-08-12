package ssc;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StuDataTest {

	StuData stuData = new StuData();
    byte a = 24; //年龄
    Student stu = new Student("SX1916025","孙仕长","男",a,100);

    @Before
    public void setUp() throws Exception {
        System.out.println("测试开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    @Test
    public void insertStu() {
        stuData.insertStu(stu);
    }

    @Test
    public void checkStuNo() {
        stuData.insertStu(stu);
        Student stu = stuData.checkStuNo("SX1916025");
        assertNotNull(stu);
    }

    @Test
    public void delateStu() {
        stuData.delateStu("SX1916025");
    }

    @Test
    public void updateStu() {
        stuData.updateStu(stu);
    }

    @Test
    public void printStu() {
        stuData.printStu(stu);
    }

    @Test
    public void printAllstuInf() {
        stuData.printAllstuInf();
    }

}
