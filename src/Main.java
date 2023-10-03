import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String[] colors = {"Красный", "Синий", "Зеленый", "Желтый"};

        ArrayList<String> colorList = new ArrayList<>(Arrays.asList(colors));

        HashSet<String> colorsSet = new HashSet<>(colorList);

        TreeSet<String> colorsTreeSet = new TreeSet<>(new ClorComparator());

        colorsTreeSet.addAll(colorsSet);



    }
}
