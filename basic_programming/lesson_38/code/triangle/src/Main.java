import java.util.Scanner;
import java.io.BufferedReader; // читает построчно в String
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

    BufferedReader br = null; // сбрасываем (обнуляем буффер)
        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ввдите 1-ю сторону треугольника");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Ввдите 2-ю сторону треугольника");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Ввдите 3-ю сторону треугольника");
        int c = Integer.parseInt(br.readLine());

        br.close();

        Triangle t1 = new Triangle( a, b, c);

    }
}






/*
System.out.println("Треугольник - проверка на возможность существования");
        System.out.println();
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = null;
        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите 1-ю сторону треугольника: ");
        // int a = sc.nextInt();
        int a = Integer.parseInt(br.readLine());

        System.out.println("Введите 2-ю сторону треугольника: ");
        // int b = sc.nextInt();
        int b = Integer.parseInt(br.readLine());

        System.out.println("Введите 3-ю сторону треугольника: ");
        // int c = sc.nextInt();
        int c = Integer.parseInt(br.readLine());

        // закрыть поток
        br.close();

        // вызываем конструктор для создания треугольника
        Triangle t1 = new Triangle(a, b, c);
 */