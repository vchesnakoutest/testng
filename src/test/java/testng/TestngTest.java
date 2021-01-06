package testng;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class TestngTest extends BaseTest {

    @BeforeSuite
    public void test5() {
        System.out.println("BEFORE SUITE");
    }

    @BeforeGroups
    public void test4() {
        System.out.println("BEFORE GROUPS");
    }

    @BeforeTest
    public void test3() {
        System.out.println("BEFORE TEST");
    }

    @BeforeClass
    public void test2() {
        System.out.println("BEFORE CLASS");
    }

    @BeforeClass
    public void test1() {
        System.out.println("BEFORE METHOD");
    }

    @Test
    public void test() {
        System.out.println("TEST");
    }


    public String itechart(double number) {
        if (number % 15 == 0) {
            return "iTechArt";
        } else if (number % 3 == 0) {
            return "iTech";
        } else if (number % 5 == 0) {
            return "Art";
        } else {
            return "Переделывай";
        }
    }

    @DataProvider(name = "Входящие данные для задачки iTechArt")
    public Object[][] inputForITechTask() {
        return new Object[][]{
                {3, "iTech"},
                {5, "Art"},
                {15, "iTechArt"},
                {6, "iTech"},
                {10, "Art"},
                {30, "iTechArt"},
                {1, "Переделывай"},
                {-1, "Переделывай"},
                {1000000000, "Art"},
                {3.3, "Переделывай"}
        };
    }

    @Test(dataProvider = "Входящие данные для задачки iTechArt")
    public void test123(double number, String expectedString) {
        String itech = itechart(number);
        assertEquals(itech, expectedString);
    }

    public String itechart2(int number) {
        if (number % 15 == 0) {
            return "iTechArt";
        } else if (number == 3) {
            return "iTech";
        } else if (number == 5) {
            return "Art";
        } else {
            return "Переделывай";
        }
    }
}
