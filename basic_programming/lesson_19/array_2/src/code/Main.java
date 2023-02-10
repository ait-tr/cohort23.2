package code;

public class Main {

    public static void main(String[] args) {
        System.out.println("Привет, мир!");
        System.out.println("Это двухмерный массив:");

        int[][] field = new int[10][10];
        for (int i=0; i < field.length; i++){
            for (int j=0; j < field.length; j++){
                field[i][j] = i;
                System.out.print(field [i][j] + "\t");
            }
            System.out.println();
        }
    }
}
