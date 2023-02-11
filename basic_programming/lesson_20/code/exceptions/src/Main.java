import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        System.out.println("Exceptions");
        System.out.println();
        System.out.println("Выход за пределы массива:");
        int[] myNumbers = {1, 2, 3};
        try {
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Out of range.");
        };
        System.out.println();
        System.out.println("Деление на 0:");

        int a = 100;
        int b = 0;
        try {
            int div = a / b;
        } catch (Exception e) {
            System.out.println("Зачем вы делите на ноль???");
        }

            /*try {
                } catch (Exception e) {
                System.out.println("Something went wrong.");
                }
             }*/
    }
}

