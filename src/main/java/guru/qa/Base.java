package guru.qa;

public class Base {

    //часто используемые
    boolean bool = true;
    char character = 'c';

    //работа с числами
    byte aByte = 113;
    short aShort = 0;
    int aInteger = 2367129;
    long aLong = 0;

    //массив
    int[] arr = new int[]{1, 2, 3};


    float aFloat = 0.0F;

    // используется более менее
    double aDouble = 0.0;

    // класс - тип данных
    String str = "abc def";

    // объекты типа string имеют поведение, которое и описывается методами
    String str1 = "abc de";

    void method() {
        String upperCase = str.toUpperCase();
        System.out.println(upperCase);
    }

    // написали в классе Base метод someMethod
    void someMethod() {
        int result0 = 14578 + 2;
        int result1 = 14578 - 8;
        int result2 = 27 / 7;
        int result3 = 27 % 7;
        int result4 = 27 * 7;

        boolean result5 = ((4 < 3) || (5 < 3));
        boolean result6 = 7 >= 6;
        boolean result7 = 7 < 6;
        boolean result8 = 7 <= 6;
        boolean result9 = 7 != 6;
        boolean result10 = 7 == 6;
        boolean result11 = !(7 > 6);
    }
}


