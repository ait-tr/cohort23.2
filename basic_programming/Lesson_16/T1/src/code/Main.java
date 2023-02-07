import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);

        int num = 1;

        for (int i = 1; i <= 10; i++ ) {
            System.out.println("Input integer");
            num = scanner.nextInt();
            System.out.println("You input " + num);
            if (num < 0) {
                System.out.println(num + " is negative integer.");
                break;}
            System.out.println(num + " is positive integer.");
            }
    }
}
