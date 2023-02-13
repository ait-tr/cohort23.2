import java.util.Scanner;
import java.lang.ArithmeticException;
import java.util.InputMismatchException;

// Пример с выходом за пределы размера массива:
// Задать массив на 3 элемента
// Обратиться к элементу массива с индексом больше 3 - программа должна закончиться аварийно
// Применить try ... catch для обработки ошибки обращения за длину массива
// Протестировать программу

// Пример с делением на 0 и обработкой неправильного ввода (символы вместо чисел)
// Сделать калькуллятор для деления с защитой от деления на 0 и ввода символов вместо цифр

public class Main {

    public static int div(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        System.out.println("Привет!");
        Scanner scann = new Scanner(System.in);

        char choice_y_or_n;

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
            } catch (InputMismatchException ex) {
                System.out.println("Ошибка " + ex.getMessage() + " означает, что нельзя вводить символы!");
            }
            System.out.println("Продолжить? y/n ");
            choice_y_or_n = scann.next().toLowerCase().charAt(0);
            if (choice_y_or_n == 'n') {
                break;
            } else continue;
        }
        }
    }

/*
    // Выход за пределы массива
        int[] myNumbers = {1, 2, 3};
        try {
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Вы обратились к элементу массива, индекс которого больше, чем длина массива.");
        };

    // Синтаксис
    try {
            // Operators
            } catch (Exception e) {
            System.out.println("Message about error.");
            }
     }

    // Функция деления a на b
    public static int div(int a, int b) {
        return a / b;
        }

    // Деление на 0
        System.out.println();
            System.out.println("Деление на 0:");
            int a = 100;
            int b = 0;
            try {
            int div = a / b;
            } catch (Exception e) {
            System.out.println("Зачем вы делите на ноль???");
            }

    // Калькулятор для действия делениея с защитой (деление на 0, ввод символов вместо чисел)
        Scanner scanner = new Scanner(System.in);
        char choice_y_or_n;
        System.out.println("Division a / b ");
        while (true) {
            int a = 0;
            int b = 0;
            int c = 0;
            try { // начало проверяемого на Exception кода
                System.out.println("Input a: ");
                a = scanner.nextInt();
                System.out.println("Input b: ");
                b = scanner.nextInt();
                c = div(a, b);
                System.out.println("Result " + a + " / " + b + " = " + c);
            } catch (ArithmeticException ex) { // определяем, что делать, если поймали Exception
                System.out.println("Ошибка " + ex.getMessage() + " На 0 делить нельзя!");
            } catch (InputMismatchException ex) {
                System.out.println("Ошибка ввода, вы ввели не число!");
            };
            System.out.println("Continue? y/n ");
            choice_y_or_n = scanner.next().toLowerCase().charAt(0);
            if (choice_y_or_n == 'n') {
                break;
            } else continue;
        }

  */