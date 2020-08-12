package ssc;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StuDataTest {

	StuData stuData = new StuData();
    byte a = 24; //����
    Student stu = new Student("SX1916025","���˳�","��",a,100);

    @Before
    public void setUp() throws Exception {
        System.out.println("���Կ�ʼ");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("���Խ���");
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
