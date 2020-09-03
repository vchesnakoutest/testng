package junit;

import org.junit.*;


/**
 * BEFORE CLASS ИЗ РОДИТЕЛЯ
 * BEFORECLASS ИЗ НАСЛЕДНИКА
 * BEFORE ИЗ РОДИТЕЛЯ
 * BEFORE ИЗ НАСЛЕДНИКА
 * METHOD
 * AFTER ИЗ НАСЛЕДНИКА
 * AFTER из РОДИТЕЛЯ
 * AFTERCLASS ИЗ НАСЛЕДНИКА
 * AFTER CLASS ИЗ РОДИТЕЛЯ
 */
public class JunitExampleBaseTest extends JunitBaseTest {

    @Test(expected = NullPointerException.class)
    public void test1() {
        System.out.println("Test 1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        throw new NullPointerException();
    }

    @Test(timeout = 2000)
    public void test2() {
        System.out.println("Test 2");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3() {
        System.out.println("Test 3");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Before
    public void beforeMethod() {
        System.out.println("Before test");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void afterMethod() {
        System.out.println("After test");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
