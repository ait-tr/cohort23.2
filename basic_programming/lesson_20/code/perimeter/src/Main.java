import java.util.Scanner;
import java.util.InputMismatchException;

// Калькулятор для вычисления периметра комнаты
// На входе: a и b - стороны прямоугольника
// На выходе: периметр прямоугольника
// Ключевой алгоритм: p = ...
// Интерфейс: защититься от ошибок пользователя при вводе a и b, нельзя вводить символы вместо цифр
// и отрицательные числла в качестве длины сторон комнаты.
// Предложить пользователю продолжить работу калькулятора
// до тех пор, пока он не откажется.
// Проверку введенного числа на позитивность выполнить в вызываемой функции,
// котороая сообщает о неправильном вводе данных.

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет!");
        System.out.println("Давай подсчитаем периметр комнаты.");

     }
}


    /*try {
            // Operators
            } catch (Exception e) {
            System.out.println("Message about error.");
            }
     }

            Scanner scanner = new Scanner(System.in);

        char choice_y_or_n;

        while (true) {
            int p = 0;
            try {
                System.out.println("Input a: ");
                int a = scanner.nextInt();
                checkPositive(a);
                System.out.println("Input b: ");
                int b = scanner.nextInt();
                checkPositive(b);
                p = 2 * a + 2 * b;
                if (a > 0 && b > 0){
                    System.out.println("Perimeter of rectangle = " + p);
                } else {
                    System.out.println("Perimeter of rectangle doesn't make sense.");
                }

            } catch (InputMismatchException ex) {
                System.out.println("Ошибка ввода, вы ввели не число!");
            };
            System.out.println("Continue? y/n ");
            choice_y_or_n = scanner.next().toLowerCase().charAt(0);
            if (choice_y_or_n == 'n') {
                break;
            } else continue;

         private static void checkPositive(int a) {
        if (a <= 0) {
            System.out.println(" Wrong input.");
        }

     */