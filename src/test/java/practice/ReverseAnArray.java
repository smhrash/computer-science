package practice;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {

        int[] arr = {1999, 2001, 2003, 2005, 2007, 2009, 2011, 2013, 2015, 2017, 2019, 2021, 2023};
        System.out.println("Original array : " + Arrays.toString(arr));

        ReverseAnArray reverseAnArray = new ReverseAnArray();

        System.out.println("Reverse array : " + reverseAnArray.reverseArray(arr));
    }

    public String reverseArray(int [] array){
        for (int i = 0; i < array.length /2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return Arrays.toString(array);
    }
}
