public class Main {
    public static void main(String[] args) {
        System.out.println("Математические методы");
        // Нам надо написать методы:
        // - Проверка, что число простое
        // - Проверка, что число четное
        // - Действие n! = 1*2*3*...*n, то есть 5! = 1*2*3*4*5 = 120

        MathMethods method1 = new MathMethods();
        System.out.println(method1.isPrimeNumber(121));
        System.out.println(method1.isPrimeNumber(17));
        System.out.println(method1.isPrimeNumber(13));
        System.out.println(method1.isPrimeNumber(4));
    }
}