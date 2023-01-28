package practice;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to reverse the array
    static void reverseArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}
//5 8 2 15 6 25 1 11 13






