package practice;

public class UpgradTest {
    public static void main(String[] args) {
//        int a = 2;
//        double d = 50;

//        int myVar;
//        myVar=50;
//        System.out.println(myVar);
//        int anotherVar= 100;
//        System.out.println(anotherVar);
//        myVar = anotherVar;
//        System.out.println(myVar);

//        int someValue = 5;
//        System.out.println(++someValue);
//        System.out.println(someValue);
//        int someOtherValue = 5;
//        System.out.println(someOtherValue++);
//        System.out.println(someOtherValue);

        // What are different variable and data type in java?
        // what are the primitive data type in java?
        //what are range of different data type?

//        int value1 = 10;
//        int value2 = 40;
//        if (value1 > value2){
//
//        }

//        int someValue = 4;
//        int factorial = 1;
//        while ()

//        int iVal = 5;
//        do {
//            System.out.println(iVal);
//            System.out.println("*2=");
//            iVal *= 2;
//            System.out.println(iVal);
//        } while (iVal < 25);

//        int i = 1;
//        while (i < 100){
//            System.out.println(i);
//            i *=2;
//
//        }

        int arr[] = {1, 56, 7, 28, 97, 96,12, 99};

        UpgradTest upgradTest = new UpgradTest();
        System.out.println(upgradTest.max(arr));
        System.out.println(upgradTest.min(arr));
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
