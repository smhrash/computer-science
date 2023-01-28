package practice;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {

        List <String> names = new ArrayList<>();
        names.add("Rony");
        names.add("Frank");
        names.add("Mike");
        for (String name : names){
            System.out.println(name);
        }
    }
}
