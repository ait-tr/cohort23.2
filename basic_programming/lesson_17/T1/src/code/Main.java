package code;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = 10 + (i*10);
            // System.out.println(myArray[i]);
        }
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element at index " + i + " = " + myArray[i]);
            sum = sum + myArray[i];
        }
        System.out.println("Sum of all elements = " + sum);
    }
}
