package ssc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MainTest.class,
        StuDataTest.class,
        StuSysTest.class
})
public class AllTests {
}
