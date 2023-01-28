package practice;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        MainTest mainTest = new MainTest();
        System.out.println(mainTest.add(2, 3));
        System.out.println(mainTest.add(2, 3, 5));

    }

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;


    }

   
}
