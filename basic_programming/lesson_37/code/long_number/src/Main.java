public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Перевод десятиричного числа в двоичное
        System.out.println("Перевод десятиричного числа в двоичное");
        long n = 9876543210L;
        System.out.println("Десятиричное число");

        String binary = "";
        binary = Integer.toBinaryString((int) n);
        System.out.println("Двоичное представление этого числа: " + binary);
        System.out.println();

        String octagal_num = Integer.toOctalString((int) n);
        System.out.println("В восьмеричной системе это: " + octagal_num);
        System.out.println();

        String hex_num = Integer.toHexString((int) n);
        System.out.println("D 16-ричной системе это: " + hex_num);
        System.out.println();
    }
}