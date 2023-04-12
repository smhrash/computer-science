package practice;

import java.util.Arrays;

public class ArrayDetails {

    public static void main(String[] args) {
        String[][] names = {{"Rony", "Tapu", "Nilay"}, {"Tomal", "Jhuma", "Sorna"}};
        System.out.println(names[0][1]);

//        int [] arr = new int[4];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        System.out.println(Arrays.toString(arr));
        int [] arr = {2, 9, 100, 22, 1, 90, 33, 66, 44};
        System.out.println(Arrays.toString(arr));
        int [] arrTwo = Arrays.copyOf(arr, 13);
        int [] arrThree = Arrays.copyOfRange(arr, 2, 6);
        System.out.println(Arrays.toString(arrTwo));
        System.out.println(Arrays.toString(arrThree));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
