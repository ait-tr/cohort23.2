import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        // считать с клавиатуры целое a
        // считать с клавиатуры целое b
        // задать функцию, которая вычисляет частное a и b
        // запустить бесконечный цикл для ввода a и b, чтобы не запускать программу каждый раз
        // проверить, что будет, если задать b = 0 - должна появиться ошибка, программа закончится аварйно
        // применить try ... catch для обработки ошибки деления на 0
        // протестировать программу
        Scanner scann = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Введите целое число a: ");
                int a = scann.nextInt();
                System.out.println("Введите целое число b: ");
                int b = scann.nextInt();
                int с = div(a, b);
                System.out.println("Частное " + a + " / " + b + " = " + с);
            } catch (ArithmeticException ex) {
                System.out.println(ex.getMessage() + " Делить на ноль нельзя!");
            }

        }
    }
    public static int div(int num1, int num2) {
        return num1 / num2;
    }
}
/*    Scanner scanner = new Scanner(System.in);

        while (true) {
                try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = div(a, b);
                System.out.println(c);
                } catch (ArithmeticException e) {
                System.out.println("Ошибка - " + e.getMessage() + ", нельзя делить на ноль! Попробуйте заново");
                } catch (InputMismatchException e) {
                System.out.println("Вы вместо чисел ввели что-то другое, попробуйте заново");
                scanner.nextLine();
                }
            }

    public static int div(int a, int b) {
        return a / b;
    }
 */