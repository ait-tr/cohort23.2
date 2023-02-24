import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Гирлянда на 32 лампочки");
        // Гирлянда из 32 "лампочек".
        // Реализуйте метод "blink", который будет мигать лампочками гирлянды один раз;

    }
}















/*
ArrayList<Integer> garland = new ArrayList<>();
        // заполняем гирлянду случайно включенными лампочками
        for ( int i = 0 ; i < 32 ; i++) {
            int e = (int)(( Math.random() * 2));
            garland.add( i, e);
        }
        // печатаем (включаем) гирлянду
        for (int i: garland) {
            System.out.print(i + " ");
        }
        // мигнули каждой лампочкой гирлянды
        for (int i = 0 ; i < garland.size(); i++) {
            blink(garland, i); // вызов метода blink, передаем гирлянду и номер лампочки, которой надо мигнуть
        }
        // задержка на 1 сек
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println('\r'); //  возврат каретки

        // печатаем (включаем) гирлянду
        for (int i: garland) {
            Thread.sleep(500);
            System.out.print(i + " ");
        }
    }

    // метод blink получает на вход гирлянду, номер "лампочки" и меняет ее состояние
    public static void blink(ArrayList<Integer> array, int n) {
        if (array.get(n) == 0) {
            array.set(n, 1);
        } else {
            array.set(n,0);
        }
    }
 */