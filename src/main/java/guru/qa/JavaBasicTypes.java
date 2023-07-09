package guru.qa;

public class JavaBasicTypes {

    // Java operators
    public static void javaOperators() {
        int add = 10 + 3;
        int subtract = 5 - 2;
        int multiply = 7 * 7;
        int divide = 10 / 3;
        int module = 10 % 3;

        System.out.println("Additional = " + add);
        System.out.println("Subtraction = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + divide);
        System.out.println("Modulus = " + module);

        boolean boo0 = 8 == 9;
        boolean boo1 = 8 > 9;
        boolean boo2 = 8 < 9;
        boolean boo3 = 8 >= 9;
        boolean boo4 = 8 <= 9;
        boolean boo5 = 8 != 9;

        System.out.println("Boo0 should be = " + boo0);
        System.out.println("Boo1 should be = " + boo1);
        System.out.println("Boo2 should be = " + boo2);
        System.out.println("Boo3 should be = " + boo3);
        System.out.println("Boo4 should be = " + boo4);
        System.out.println("Boo5 should be = " + boo5);

        //Сonditional operation
        int price = 1000;
        if ((price >= 5000) && (price < 10000)) {
            System.out.println("Discount is 25%");
        } else if ((price >= 800) && (price < 5000)) {
            System.out.println("Discount is 20%");
        } else if ((price >= 600) && (price < 800)) {
            System.out.println("Discount is 10%");
        } else if ((price >= 500) && (price < 600)) {
            System.out.println("Discount is 5%");
        } else {
            System.out.println("No Discount");
        }
    }

    // Operations with mixed data types
    public static void javaOperations() {
        String s = "6000";
        int i = 6000;
        float f = 7.3F;
        double d = -113.1;
        System.out.println("Mixed integer and double = " + (i % d));
        System.out.println("Mixed integer and float = " + (i / f));
        System.out.println("Mixed string and int = " + (s + i));
    }

    // Overflow min & max
    public static void javaOverflow() {
        int overflowMin = Integer.MIN_VALUE;
        System.out.println("Overflow min value " + (overflowMin - 100000000));

        int overflowMax = Integer.MAX_VALUE;
        System.out.println("Overflow max value " + (overflowMax + 100000000));
    }


    public static void main(String[] args) {
        javaOperators();
        javaOperations();
        javaOverflow();
    }
}