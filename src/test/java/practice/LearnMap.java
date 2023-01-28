package practice;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {

        Map<Integer, String> list = new HashMap<>();
        list.put(1, "Tyler");
        list.put(2, "Shayne");
        list.put(3, "Anu");
        list.put(4, "Tilahun");
        list.put(5, "Sarker");
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        });
        list.remove(4);
        list.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        });
        System.out.println(list.values());
        System.out.println(list.keySet());
        list.replace(1, "Tyler", "Tom");
        list.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        });

        System.out.println(list.containsValue("Tom"));
        System.out.println(list.containsKey(2));
        System.out.println(list.equals("Sarker"));
        System.out.println(list.hashCode());

        list.clear();
        System.out.println(list.values());
    }

}
