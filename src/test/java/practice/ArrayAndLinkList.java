package practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayAndLinkList {

    public static void main(String[] args) {

        ArrayList<Float> randomNum = new ArrayList<>();
        randomNum.add(2f);
        randomNum.add(4f);
        randomNum.add(5f);
        randomNum.add(10f);
        randomNum.add(99f);
        System.out.println(randomNum.get(2));

        LinkedList<Float> random = new LinkedList<>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99f);
        System.out.println(random.get(2));
    }
}
