import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Бинарный поиск в массиве:");
        // На входе массив из 10 целых чисел от 0 до 100, числа заданы произвольно,
        // массив отсортирован от меньшего к большему элементу
        // пользователь вводит интересующее его число - есть оно в массиве или нет?
        // на выходе ответ - есть или нет искомый элемент. Если есть, то выводится индекс найденного элемента массива
        // ключевой алгоритм - поделить массив пополам и понять, в какой половинке искомый элемент
        // продолжать,пока не будет найден искомый элемент массива или не закончится массив

        int[] array = {3, 5, 19, 22, 33, 46, 51, 64, 85, 99};
        int lenght = array.length;
        System.out.println("Длина массива: " + lenght);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ввведите интересующее вас число в массиве: ");
        int element = sc.nextInt();
        System.out.println("Ищем элемент " + element + " в массиве.");

        // задаем начальные условия
        boolean hasElement = false;

        int left = 0; // это левый конец массива (индекс)
        int right = lenght - 1; // это правый конец массива (индекс)
        int middle = left + (right - left)/2; // это индекс середины массива

        while (left < right) {
            if (element < array[middle] ) { // если искомый элемент в левой половине
                right = middle - 1;

            } if (element > array[middle] ) { // если искомый элемекнт в правой половине
                left = middle + 1;

            } else {
                hasElement = true;
                break;
            }

            middle = left + (right - left)/2; // вычисляем новую середину

        }

        System.out.println(hasElement);

    }
}


/*

        int[] array = {-20, -10, 20, 40, 50, 60, 70, 80, 90, 100};
        int lenght = array.length;
        System.out.println(lenght);

        Scanner sc = new Scanner(System.in); // включили сканер для чтения клавиатуры
        System.out.println("Введите искомый элемент массива: "); // Приглашение пользователю
        int element = sc.nextInt();
        System.out.println("Ищем элемент " + element);

        // задаем начальные условия
        boolean hasElement = false;  // логическая переменная, отвечает за найден или не найден элемент массива

        int left = 0; // индекс левого элемента массива
        int right = array.length - 1; // индекс правого элемнта массива
        int middle = left + (right - left) / 2; // индекс середины между левым и правым элементом

        while (left <= right) { // выполняем цикл, пока левый индекс меньше или равен правого
            if (element < array[middle]) { // если элемент в левой половине массива
                right = middle - 1; // переносим правый конец за середину
            } else if (element > array[middle]) {
                left = middle + 1; // переносим левый за середину
            } else {
                hasElement = true;
                break;
            }
            middle = left + (right - left) / 2; // вычисляем новую середину
        }

        if (hasElement) {
            System.out.println("Элемент найден, его индекс: " + middle);
        } else {
            System.out.println("Элемент в массиве не найден.");
        }
 */