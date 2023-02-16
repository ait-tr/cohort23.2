import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // ArrayList<int> myArrayList = new ArrayList<int>();
        // Задаем значения значений ArrayList используя метод asList
        ArrayList<String> namesList = new ArrayList<String>(
            Arrays.asList("Peter","Vladimir","Stepan"));
        System.out.println(namesList);

        System.out.println();

        // Вывод ArrayList с помощью цикла for each
        for (String st : namesList) {
            System.out.println(st);
        }

        System.out.println();

        // Вывод Array с помощью цикла for each
        int[] myArray = new int[]{ 10, 50, 60, 80, 90 }; // определили массив

        for (int el : myArray) {
            System.out.print(el + " | ");
        }

        System.out.println();

        // Обратная сортировка ArrayList
        ArrayList<String> mylist = new ArrayList<String>();
            mylist.add("practice");
            mylist.add("code");
            mylist.add("quiz");
        System.out.println("Original List : " + mylist);

        Collections.reverse(mylist);

        System.out.println("Reversed List: " + mylist);

    }
}