package code;

public class Main {

    public static void main(String[] args) {
        //int[] myArray1 = new int[8];
        //int[] myArray2 = new int[7];

        int[] myArray1 = new int[]{5, 3, 3, 4, 5, 4, 5, 5};
        int[] myArray2 = new int[]{3, 4, 5, 5, 2, 5, 4};

        double sum1 = 0;
        double sum2 = 0;

        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < myArray1.length; i++) {
            sum1 += myArray1[i];
            average1 = sum1 / myArray1.length;
        }
        System.out.println(sum1);
        System.out.println(average1);

        for (int i = 0; i < myArray2.length; i++) {
            sum2 += myArray2[i];
            average2 = sum2 / myArray2.length;
        }
        System.out.println();
        System.out.println(sum2);
        System.out.println(average2);

        System.out.println();
        System.out.println("Средний балл ученика 1 = " + average1);
        System.out.println("Средний балл ученика 2 = " + average2);

        if (average1 > average2) {
            System.out.println("Ученик 1 учится лучьше");
        } else {
            System.out.println("Ученик 2 учится лучьше");
        }
    }
}

