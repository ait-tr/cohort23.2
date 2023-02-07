package code;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Привет, мир! Hallo Welt!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int num = scanner.nextInt();
        System.out.println("Вы ввели число: " + num);

        int sum = 0;

        for (int i=2; i <= num; i++ ){
            if (i%2 == 1) continue; //нашли нечетное число
            sum = sum + i;
        }
        System.out.println("Сумма всех четных чисел: " + sum);
    }
}
