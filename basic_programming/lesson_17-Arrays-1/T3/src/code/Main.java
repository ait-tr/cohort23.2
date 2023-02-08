package code;
// Задача про успеваемость двух учеников

public class Main {

    public static void main(String[] args) {
        //int[] myArray1 = new int[8];
        //int[] myArray2 = new int[7];

        // определяем и заполняем массивы
        int[] myArray1 = new int[]{5, 3, 3, 4, 5, 4, 5, 2};
        int[] myArray2 = new int[]{3, 4, 5, 5, 2, 5, 4, 5, 5};

        double sum1 = 0;
        double sum2 = 0;

        double average1 = 0;
        double average2 = 0;

       for (int i=0; i < myArray1.length; i++)
       {sum1 = sum1 + myArray1[i];}

        for (int i=0; i < myArray2.length; i++)
        {sum2 += myArray2[i];}

        average1 = sum1 / myArray1.length;
        average2 = sum2 / myArray2.length;

        System.out.println(average1);
        System.out.println(average2);

        if (average1 > average2) {
            System.out.println("1-й учится лучше 2-го");
        } else {
            System.out.println("2-й учится лучше 1-го");
        }
    }

}

