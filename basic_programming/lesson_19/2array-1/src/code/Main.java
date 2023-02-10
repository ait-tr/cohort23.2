package code;

public class Main {

    public static void main(String[] args) {
        System.out.println("Привет, мир!");
        System.out.println("Работа с 2-хмерным массивом.");

        int k = 0;
        String charAt;

        int [][] field = new int[8][8];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++){
             if ((i + j) % 2 ==0 ){
                 field[i][j]= 0;
             }  else {
                 field[i][j]= 1;
             }

                System.out.print(field[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
