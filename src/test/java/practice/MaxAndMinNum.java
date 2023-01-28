package practice;

public class MaxAndMinNum {
    public static void main(String[] args) {

        int arr[] = {1, 56, 7, 28, 97, 96,12, 99};

        UpgradTest upgradTest = new UpgradTest();
        System.out.println("Largest Number is : " + upgradTest.max(arr));
        System.out.println("Smallest Number is : " + upgradTest.min(arr));
    }

    public  int max(int[]array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array [i] > max){
                max = array[i];

            }
        }
        return max;
    }

    public  int min(int[]array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array [i] < min){
                min = array[i];


            }
        }
        return min;


//        int min = arr[0];
//        int max = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max)
//                max = arr[i];
//            else if (arr[i] < min)
//                max = arr[i];
//        }
//
//        System.out.println("Largest Number is : " + max);
//        System.out.println("Smallest Number is : " + min);

    }
}
