package ssc;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

	Main m = new Main();
	@Before
	public void setUp() throws Exception {
		System.out.println("���Կ�ʼ");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("���Խ���");
	}

	@Test
	public void test() {
		m.showMenu();
	}

}
