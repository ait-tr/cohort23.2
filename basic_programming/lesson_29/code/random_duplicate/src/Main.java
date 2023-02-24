import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача о поиске случайного дубликата в массиве.");

        // Дан массив последовательных натуральных чисел от 1 до 100, какое-то одно число в нем задублировано.
        // Создать такой массив программным способом, задублированное число определяется случайным образом.
        // Неодходимо выяснить, какое это число?
        // Ключевой алгоритм:
        // шаг 1 - заполним массив циклом for от 1 до 100
        // шаг 2 - вычислим сумму всех элементов, циклом
        // шаг 3 - задумать случайное целое число в интервале от 1 до 100 и добавить его в массив
        // шаг 4 - вычислим сумму элементов нового массива, который на 1 элемент больше
        // шаг 5 - вычесть из новой суммы масиива старую, эта разница и будет дубликатом

        ArrayList<Integer> numbers = new ArrayList<>();
        // заполняем массив данными
        for ( int i = 0   ; i < 100  ; i++ ) {
            numbers.add( i, i + 1);
        }
        // напечатаем массив
        System.out.println(numbers);

        int sum = 0;
        int sum1 = 0;

        // сумма элементов массива
        for ( int i= 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i); // суммируем в sum все элементы массива
        }
        // вывод результата
        System.out.println("Длина массива:  " + numbers.size() + " , сумма всех элементов: " + sum);

        // задумываем случайное число (дубликат)
        int random = (int)(Math.random()*(100 - 1 + 1) - 1);

        numbers.add(random, random); // на ма место с номером random добавляем это число

        // напечатаем новый массив с дубликатом
        System.out.println(numbers);

        // сумма элементов нового массива
        for ( int i= 0; i < numbers.size(); i++) {
            sum1 = sum1 + numbers.get(i); // суммируем в sum1 все элементы массива
        }

        int duplicat = sum1 - sum; // вычисляем дубликат как разнницу сумм элементов массивов

        // вывод результата
        System.out.println("Длина нового массива:  " + numbers.size() + " , добавленный элемент: " + duplicat);

        // ________________________
        // ArrayList умеет отличать коллизию от реальной перезаписи элемента.
        // Когда структуре дают новую пару «ключ-значение», коллекция проверяет, есть ли в массиве такие хэши и такие ключи.
        // Результат такой:
        // если таких хэшей и ключей нет, в хэш-таблицу просто добавляется новая пара;
        // если такой ключ есть, это перезапись — структура переписывает элемент с таким же ключом;
        // если такого ключа нет, но хэш есть — это коллизия,
        // новое значение записывается в ту же «корзинку» за предыдущим.


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

        ________________________
        ArrayList умеет отличать коллизию от реальной перезаписи элемента.
        Когда структуре дают новую пару «ключ-значение», она проверяет, есть ли в массиве такие хэши и такие ключи.
        Результат такой:
            если таких хэшей и ключей нет, в хэш-таблицу просто добавляется новая пара;
            если такой ключ есть, это перезапись — структура переписывает элемент с таким же ключом;
            если такого ключа нет, но хэш есть — это коллизия,
            новое значение записывается в ту же «корзинку» за предыдущим.

 */