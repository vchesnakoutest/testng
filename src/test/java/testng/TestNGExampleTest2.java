package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGExampleTest2 {

    @DataProvider
    public Object[][] asd() {
        return new Object[][]{
                {"email1@mailinator.com", "password01", true},
                {"email2@mailinator.com", "password01", false},
                {"email3@mailinator.com", "password01", false}
        };
    }

    @Test(invocationCount = 10, threadPoolSize = 5)
    public void test6() {
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Lots of attempts");
    }
}
