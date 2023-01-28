package practice;

public class ArrayContainsTheValue {

    public static void main(String[] args) {
        int[] intArray = new int[]{1999, 2001, 2003, 2005, 2007, 2009, 2011, 2013, 2015, 2017, 2019, 2021, 2023};
        boolean found = false;
        int searchedValue = 2013;

        for(int x : intArray){
            if(x == searchedValue){
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}
