package testng;

import org.testng.annotations.*;

@Listeners(TestListener.class)
public class BaseTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BEFORE SUITE BASE");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("BEFORE GROUPS BASE");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BEFORE TEST BASE");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BEFORE CLASS BASE");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BEFORE METHOD BASE");
    }
}
