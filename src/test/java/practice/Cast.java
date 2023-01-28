package practice;

import java.util.Scanner;

public class Cast {
    public static void main(String[] args) {
        int a;
        float f;
        double d;

        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        f = input.nextFloat();
        d = input.nextDouble();

        float x = (float) a;
        int y =  (int) f;
        float z = (float) d;

        System.out.println("x="+ x + " y"+ y + " z="+ z);



    }




}
