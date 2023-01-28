package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assignment4 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Rony");
        names.add("Frank");
        names.add("Mike");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("============================================================");
        names.add(0, "Sarker");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("============================================================");
        System.out.println(names.get(2));

        System.out.println("============================================================");

        Iterator<String> it = names.iterator();
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(names.listIterator().next());
        System.out.println(names.size());

        List<String> fullNames = new ArrayList<>();
        fullNames.add("Sarker Rashid");
        fullNames.add("Rony Irani");
        fullNames.add("Frank Solner");
        fullNames.add("Mike Burkat");

        names.addAll(fullNames);
        for (String name : names) {
            System.out.println(name);
        }
        names.remove("Sarker");
        System.out.println(names);
        names.remove(3);
        System.out.println(names);
        names.removeAll(fullNames);
        System.out.println(names);
        fullNames.retainAll(names);
        System.out.println(fullNames);
        System.out.println(names.containsAll(fullNames));
        System.out.println(names);

        names.clear();

        System.out.println(names.isEmpty());
    }
}
