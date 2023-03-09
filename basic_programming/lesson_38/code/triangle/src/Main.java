import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Треугольник - проверка на возможность существования");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 1-ю сторону треугольника: ");
        int a = sc.nextInt();
        System.out.println("Введите 2-ю сторону треугольника: ");
        int b = sc.nextInt();
        System.out.println("Введите 3-ю сторону треугольника: ");
        int c = sc.nextInt();

        Triangle t1 = new Triangle(a, b, c);

    }
}