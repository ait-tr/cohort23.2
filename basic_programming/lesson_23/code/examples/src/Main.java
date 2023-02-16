import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // ArrayList<int> myArrayList = new ArrayList<int>();

        // Задаем значения значений ArrayList используя метод asList
        ArrayList<String> namesList = new ArrayList<String>(
            Arrays.asList ("Peter","Vladimir","Stepan", "Sasha", "Leonid"));
        System.out.println(namesList);

        System.out.println();

        // Вывод ArrayList с помощью цикла for each
        for (String st : namesList) {
            System.out.println(st);
        }

        ArrayList<String> arr = new ArrayList<>(
                Arrays.asList("1", "2", "3", "4", "5")
        );
        System.out.println(" -- Вывод исходного массива -- \n" + arr + "\n_______");
        System.out.println(" -- Вывод массива в цикле -- ");
// Ключевая часть начало:
        for (String item : arr) {
            item = "9999";
            System.out.printf("%s | ", item);
        }
// Ключевая часть конец.
        System.out.println("\n_______\n -- Исходный массив не изменился -- \n" + arr);

        System.out.println("\n\n ------ Второй вариант ------ \n");
        System.out.println(" -- Вывод исходного массива -- \n" + arr + "\n_______");
        System.out.println(" -- Вывод массива в цикле -- ");
// Ключевая часть начало:
        int i = 0;
        for (String item : arr) {
            arr.set(i, "9999");
            i++;
            System.out.printf("%s | ", item);
        }
// Ключевая часть конец.
        System.out.println("\n_______\n -- Исходный массив ИЗМЕНИЛСЯ -- \n" + arr);

        // Обратная сортировка ArrayList
        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("practice");
        mylist.add("code");
        mylist.add("quiz");
        mylist.add("lesson");
        System.out.println("Original List : " + mylist);

        Collections.reverse(mylist);

        System.out.println("Reversed List: " + mylist);


    }
}

/*
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
 */