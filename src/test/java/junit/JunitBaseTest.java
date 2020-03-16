package junit;

import org.junit.*;

public class JunitBaseTest {
    
    @BeforeClass
    public static void t1() {
        System.out.println("Before class Base");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Before
    public void t2() {
        System.out.println("Before test Base");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void t3() {
        System.out.println("After test Base");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void t4() {
        System.out.println("After class Base");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
