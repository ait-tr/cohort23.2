// Опрелеить массив для хранения 10 чисел.
// Заполнить массив целыми числами кратными 10 от 10 до 100.
// Распечатать элементы массива в виде: Element at index 0: значение элемента.

// Сложить все элементы массива и вывести результат.

package code;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /*Задача 1:
        Опрелеить массив для хранения 10 чисел.
        Заполнить массив целыми числами кратными 10 от 10 до 100.
        Распечатать элементы массива в виде: Element at index 0: значение элемента.

        Задача 2:
        Сложить все элементы массива из Задачи 1 и вывести результат.

        */

        int[] myArray = new int[10]; // определили массив

        for (int i = 0; i < myArray.length; i++) // цикл по всем элементам массива
        {
            myArray[i] = i * 10 + 10; // заполняем массив
            System.out.println("Element at index " + i + " " + myArray[i]);
        }
        int sum = 0;

        for (int i = 0; i < myArray.length; i++){
            sum = sum + myArray[i]; //накописли сумму всех элементов массива
        }
        System.out.println("Sum of elements of Array is: " + sum); // Напечатали результат
        System.out.println();

        /*Задача 3.
        Даны оценки двух учеников за четверть:
        Ученик1: 5, 3, 3, 4, 5, 4, 5, 5
        Ученик2: 3, 4, 5, 5, 2, 5, 4
        Найдите средний балл для каждого ученика и выясните, кто из них лучше учится.*/

        // определяем и заполняем массивы
        int[] myArray1 = new int[]{5, 3, 3, 4, 5, 4, 5, 2};
        int[] myArray2 = new int[]{3, 4, 5, 5, 2, 5, 4, 5, 5};

        double sum1 = 0;
        double sum2 = 0;

        double average1 = 0;
        double average2 = 0;

        for (int i=0; i < myArray1.length; i++)
            {sum1 = sum1 + myArray1[i];}

        for (int i=0; i < myArray2.length; i++)
            {sum2 += myArray2[i];}

        average1 = sum1 / myArray1.length;
        average2 = sum2 / myArray2.length;

        System.out.println("Средний балл 1-го ученика " + average1);
        System.out.println("Средний балл 1-го ученика " + average2);
        System.out.println();

        if (average1 > average2) {
            System.out.println("1-й ученик учится лучше 2-го");
        } else {
            System.out.println("2-й ученик учится лучше 1-го");
        }
    }
}
