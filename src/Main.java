import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Красный");
        colors.add("Зеленый");
        colors.add("Синий");
        colors.add("Желтый");

        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
            if (color.equals("Зеленый")) {
                iterator.remove();
            }
        }
        System.out.println("Итого: " + colors);

    }
}
