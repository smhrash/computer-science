package practice;

public class FindIndexOfArray {

    public static void main(String[] args) {
        int[] arr = {1999, 2001, 2003, 2005, 2007, 2009, 2011, 2013, 2015, 2017, 2019, 2021, 2023};

        // find the index of 2007
        System.out.println("Index position of 2007 is: "
                + findIndex(arr, 2007));

        // find the index of 2011
        System.out.println("Index position of 2011 is: "
                + findIndex(arr, 2011));

    }

    public static int findIndex(int array[], int t) {

        // if array is Null
        if (array == null) {
            return -1;
        }

        // find length of array
        int len = array.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (array[i] == t) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }
}
