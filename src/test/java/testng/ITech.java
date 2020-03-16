package testng;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ITech {

    public static String iTechArt(int number) {
        if(number%15==0) {
            return "iTechArt";
        } else if (number%5==0) {
            return "Art";
        } else if (number%3==0){
            return "iTech";
        } else {
            return "Blablablabla";
        }
    }



    @Test
    public void test123(){
        fibonachi(8);
    }

    public static void fibonachi(int number) {
        int firstElement = 1;
        int secondElement = 2;
        int nextElement;
        System.out.println(firstElement);
        System.out.println(secondElement);
        for(int i = 2; i < number; i++) {
            nextElement = firstElement+secondElement;
            System.out.println(nextElement);
            firstElement = secondElement;
            secondElement = nextElement;
        }
    }

    @Test
    public void testITechArt() {
        assertEquals("iTech", iTechArt(6));
    }

    @Test
    public void testITechArt2() {
        assertEquals("Art", iTechArt(10));
    }

    @Test
    public void testITechArt3() {
        assertEquals("iTechArt", iTechArt(30));
    }

    @Test
    public void testITechArt4() {
        assertEquals("iTechArt", iTechArt(0));
    }

    @Test
    public void testITechArt5() {
        assertEquals("Blablablabla", iTechArt(-1));
    }

    @Test (expected = ArithmeticException.class)
    public void divideByZero() {
        int i = 5;
        int bla = 5/0;
    }

    public void fibona(int number) {
        if(number > 0) {
            int firstNumber = 1;
            int secondNumber = 2;
            int nextNumber;


            System.out.println(firstNumber);
            if (number > 1)
                System.out.println(secondNumber);

            for (int i = 2; i < number; i++) {
                nextNumber = firstNumber + secondNumber;
                System.out.println(nextNumber);
                firstNumber = secondNumber;
                secondNumber = nextNumber;
            }
        }
    }

    @Test
    public void blablaas() {
        fibona(10);
    }
}
