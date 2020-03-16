package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGExampleTest2 {

    @DataProvider(name = "EmailData")
    public Object[][] asd() {
        return new Object[][]{
                {"email1@mailinator.com", "password01", true},
                {"email2@mailinator.com", "password01", false},
                {"email3@mailinator.com", "password01", false},
                {"email3@mailinator.com", "password01", false},
                {"email3@mailinator.com", "password01", false},
                {"email3@mailinator.com", "password01", false},
                {"email3@mailinator.com", "password01", false},
                {"email3@mailinator.com", "password01", false},
                {"email3@mailinator.com", "password01", false},
                {"email3@mailinator.com", "password01", false},
                {"email3@mailinator.com", "password01", false},
                {"email3@mailinator.com", "password01", false},
                {"email3@mailinator.com", "password01", false}
        };
    }

    //@Test(invocationCount = 10, threadPoolSize = 5)
    @Test(dataProvider="EmailData")
    public void test5(String email, String password, boolean validLogin) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Lots of attempts");
    }

    @Test(invocationCount = 5, threadPoolSize = 5)
    public void test23() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Lots of attempts");
    }
}
