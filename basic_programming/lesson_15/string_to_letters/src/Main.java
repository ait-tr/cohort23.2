import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input word: ");
        String word = scanner.nextLine();
        System.out.println("Your input: " + word);
        int n = word.length();
        System.out.println("Length of word is: " + n);

        char ch = ' ';
        for (int i = 0; i <= (n - 1); i++){
            ch = word.charAt(i);
            System.out.println(ch);
        }
    }
}
