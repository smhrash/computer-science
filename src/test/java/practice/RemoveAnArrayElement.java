package practice;

import java.util.Arrays;

public class RemoveAnArrayElement {
    public static void main(String[] args) {

        int[] arr = {1999, 2001, 2003, 2005, 2007, 2009, 2011, 2013, 2015, 2017, 2019, 2021, 2023};
        System.out.println("Original array : " + Arrays.toString(arr));
        RemoveAnArrayElement arrayElement = new RemoveAnArrayElement();
        System.out.println("After removing the fourth element: " + arrayElement.modifiedArray(arr));
    }

    public String modifiedArray(int[] array) {
        int removeIndex = 3;
        for (int i = removeIndex; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        return Arrays.toString(array);
    }

}
