package practice;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {

        Set <Integer> numbers = new HashSet<>();
        numbers.add(20);
        numbers.add(20);
        numbers.add(20);
        numbers.add(25);
        numbers.add(10);
        numbers.add(5);
       for (Integer num : numbers){
           System.out.println(num);
       }
    }
}
