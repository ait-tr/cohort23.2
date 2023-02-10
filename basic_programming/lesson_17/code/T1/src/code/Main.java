// Опрелеить массив для хранения 10 чисел.
// Заполнить массив целыми числами кратными 10 от 10 до 100.
// Распечатать элементы массива в виде: Element at index 0: значение элемента.

// Сложить все элементы массива и вывести результат.

package code;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] myArray = new int[10]; // определили массив


        for (int i = 0; i < myArray.length; i++)
        { // цикл по всем элементам массива
            myArray[i] = i * 10 + 10; // заполняем массив
            System.out.println("Element at index " + i + " " + myArray[i]);
        }
    int sum = 0;

        for (int i = 0; i < myArray.length; i++){
            sum = sum + myArray[i]; //накописли сумму всех элементов массива
        }
        System.out.println("Sum of elements of Array is: " + sum);
    }
}
