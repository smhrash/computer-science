package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDetails {

    public static void main(String[] args) {

        List<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.add(101f);

        printListFwd(random);
        System.out.println("================");
        printListBwd(random);
        System.out.println("================");
        iterateAltn(random);


    }

    public static void printListFwd(List<Float> arr) {
        ListIterator<Float> list = arr.listIterator();
        while (list.hasNext()) {
            System.out.println(list.next());
        }
    }

    public static void printListBwd(List<Float> arr) {
        ListIterator<Float> list = arr.listIterator(arr.size());
        while (list.hasPrevious()) {
            System.out.println(list.previous());
        }
    }

    public static void iterateAltn(List<Float> num) {
        ListIterator<Float> it = num.listIterator(1);
        while (it.hasNext()) {
            System.out.println(it.next());
            if (it.hasNext()) {
                it.next();
            }
        }
    }

    public void iterate (List<Integer> numberList) {
        ListIterator<Integer> it = numberList.listIterator(1);
        it.next();
        it.next();
        it.previous();
        System.out.println(it.next());
    }

    public void process(List<Integer> numberList){
        numberList.add(2, 5);
        System.out.println(numberList.get(3));
    }
}

