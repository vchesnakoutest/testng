package junit;

import org.junit.*;

public class JunitExampleBaseTest extends JunitBaseTest{
    
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

    @Test(timeout = 2)
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
}
