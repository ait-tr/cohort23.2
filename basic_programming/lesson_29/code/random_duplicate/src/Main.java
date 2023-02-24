import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача о поиске случайного дубликата в массиве.");

        // Дан массив последовательных натуральных чисел от 1 до 99, какое-то одно число в нем задублировано.
        // Создать такой массив программным способом, задублированное число определяется случайным образом.
        // Неодходимо выяснить, какое это число?
        // Ключевой алгоритм:
        //
        //





    }
}








/*
        ArrayList<Integer> numbers = new ArrayList<>();
        // заполняем массив последовательными числами, начиная с 1
        for (int i = 0; i < 100; i++) {
            numbers.add(i, i + 1);
        }
        System.out.println(numbers);
        // Подсчитаем сумму элементов этого массива
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
           sum = sum + numbers.get(i);
        }
        System.out.println("Длина массива: " + numbers.size());
        System.out.println("Сумма его элементов: " + sum);
        // задумали случайный дубликат
        int duplicate = (int)(( Math.random() * (10 - 1 + 1) + 1));
        // добавили дубликат в массив
        numbers.add(duplicate, duplicate);
        System.out.println("Длина массива стала: " + numbers.size());
        System.out.println(numbers);

        int sum1 = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum1 = sum1 + numbers.get(i);
        }
        System.out.println("Сумма его элементов: " + sum1);

        int find_duplicate = sum1 - sum;
        System.out.println("Дубликат:" + find_duplicate );
 */