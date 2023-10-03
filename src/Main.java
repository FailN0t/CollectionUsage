import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> basket = new HashMap<>();

        basket.put("Молоко", 20);
        basket.put("Масло", 10);
        basket.put("Хлеб", 15);

        TreeMap<String, Integer> basketMap = new TreeMap<>(new ProductComparator());

        basketMap.putAll(basket);
        for(String produkt : basketMap.keySet()){
            System.out.println(produkt + " - " + basketMap.get(produkt));
        }
        for(Map.Entry<String, Integer> count : basketMap.entrySet()){
            System.out.println(count.getKey() + " - " +  count.getValue());
        }
        for (Integer count : basketMap.values()) {
            System.out.println(count);
        }

    }
}
