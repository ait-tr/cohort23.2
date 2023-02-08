package code;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Задаем начальные данные
        System.out.println("Hello!!!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input N");
        int n = scanner.nextInt();
        System.out.println("Your input number = " + n);

    // Определяем, простое число или нет
    boolean isPrime = true;

    for (int i = 2; i < n; i++) {
        double div = n % i;
        if (div == 0){
            System.out.println("Число разделилось нацело на " + i);
            isPrime = false;
            }
        }
        if (isPrime) {
        System.out.println("Number " + n + " is prime.");
                }
        else {
            System.out.println("Number " + n + " is NOT prime.");
            }
    }
}
