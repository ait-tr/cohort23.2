package code;

public class Main {

    public static void main(String[] args) {

        // Опрелеить массив для хранения 10 чисел.
        // Заполнить массив целыми числами кратными 10 от 10 до 100.
        // Распечатать элементы массива в виде: Element at index 0: значение элемента.

        // Что будем вводить? - ничего, массив будет определен внутри программы.
        // Что на входе - массив
        // Что надо сделать? - запустить цикл для заполнения масива его данными, потом его и распечатать.
        // Что на выходе - распечатанный массив

        // Ключевой алгоритм - номер каждого элемнета массива * 10, заполним массив в цикле

        int[] numArray = new int[10];

        for (int i = 1; i <= 10; i++ ){
            numArray[i] = 10 * i;
            System.out.println(numArray[i]);
        }

    }
}