package testng;

import org.testng.annotations.*;

public class TestNGExampleTest {
    
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void dependsOn() {
        throw new NullPointerException();
    }
    
    @Test(alwaysRun = false, dependsOnMethods = {"dependsOn"})
    public void test1() {
        
    }

    @Test(description = "description", enabled = false, timeOut = 2)
    public void test2() {

    }

    @Test(description = "description", enabled = false, timeOut = 2, groups = {"test", "slow"})
    public void test3() {

    }

    @Parameters({"param1", "param2"})
    @Test(groups = {"slow"})
    public void test4(@Optional("1") int p1, @Optional("string") String p2) {
        System.out.println(p1 + " " + p2);
    }

    @Test(dataProvider="getData")
    public void test5(int p1, String p2) {
        System.out.println("Instance DataProvider Example: Data(" + p1 + ", " + p2 + ")");
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{{5, "five"}, {6, "six"}, {7, "seven"}};
    }

    @Test(invocationCount = 10, threadPoolSize = 5)
    public void test6() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Lots of attempts");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After test");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeGroups(groups = "slow")
    public void beforeGroups() {
        System.out.println("Before groups");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterGroups(groups = "slow")
    public void afterGroups() {
        System.out.println("After groups");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
