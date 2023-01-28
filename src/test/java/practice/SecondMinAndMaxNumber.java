package practice;

public class SecondMinAndMaxNumber {
    private int secondMinNum(int array[]) {
        int secondMin = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                secondMin = min;
                min = array[i];
            } else if (array[i] < secondMin) {
                secondMin = array[i];
            }
        }
        return secondMin;
    }

    private int minNum(int array[]) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private int secondMaxNumber(int array[]) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    private int maxNumber(int array []) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
          if (array[i] > max) {
              max = array[i];
          }
        }
        return max;

    }

    public static void main(String[] args) {
        int arr[] = {23, 45, 0, -1, -99, 99, 33};
        for (int ar : arr) {
            System.out.print(ar + " ");
        }
        System.out.println();

        SecondMinAndMaxNumber s = new SecondMinAndMaxNumber();
        System.out.println("The second smallest number is: " + s.secondMinNum(arr));
        System.out.println("The smallest number is: " + s.minNum(arr));
        System.out.println("The second largest number is: " + s.secondMaxNumber(arr));
        System.out.println("The largest number is: " + s.maxNumber(arr));
    }
}
