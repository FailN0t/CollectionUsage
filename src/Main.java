import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] colors = {"Красный", "Синий", "Зеленый", "Желтый"};
        ArrayList<String> colorList = new ArrayList<>();
        for (String color : colors){
            colorList.add(color);
        }
        colorList.addAll(Arrays.asList(colors));

        System.out.println(colorList);

        String[] newColors = new String[colorList.size()];

        for (int i = 0; i < newColors.length; i++) {
            newColors[i] = colorList.get(i);
        }

        System.out.println(Arrays.toString(newColors));
    }
}
