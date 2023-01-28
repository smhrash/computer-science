package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciSeries {

    private String fibonacci(int counter) {
        int num1 = 0;
        int num2 = 1;
        int num3;
        ArrayList<Integer> fc = new ArrayList<>();
        fc.add(num1);
        fc.add(num2);
        for (int i = 0; i < counter; i++) {
            num3 = num1 + num2;
            fc.add(num3);
            num1 = num2;
            num2 = num3;
        }
        return Arrays.toString(new ArrayList[]{fc});
    }

    public static void main(String[] args) {
        FibonacciSeries fs = new FibonacciSeries();
        System.out.println(fs.fibonacci(10));
    }
}
