package code;

public class Main {

    public static void main(String[] args) {
        System.out.println("Привет, мир!");

        // арифметическая прогрессия A(n) = A1 + d*(n-1), d - разница прогресии, A1 - первый член
        // Пусть A1 = 15, d = 7, сформировать массив из 10 первых чисел такой арифметической прогрессии
        // вывести на печать в строчку.

        // Что будем вводить? - ничего, будем использовать данные из задачи в коде
        // Что на входе? - данные про прогрессию
        // Что нужно сделать? - объявить массив и занести в него данные
        // Ключевой алгоритм? - цикл, который заполняет массив

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = 15 + 7 * (i);
            System.out.print(a[i] + " | ");
        }

        // Задача 2. Заполнение массива случайными числами
        // бросаем кубик с 6-ю гранями 20 раз

        // Что будем вводить? - ничего, не надо
        // Что на входе? - есть датчик случайных чисел
        // Что нужно сделать? - обратиться к датчику случайных чисел 20 раз
        // с запросом целых случайных чисел от 1 до 6
        // Ключевой алгоритм? - цикл for и заполняем массив результатами бросков кубика

        System.out.println();
        System.out.println();

        int[] happines = new int[20];

        for (int i = 0; i < happines.length; i++) {
            happines[i] = (int)(( Math.random() * (6 - 1 + 1) + 1));
            System.out.print(happines[i] + " | ");
        }

    }
}