public class Main {
    public static void main(String[] args) {
        System.out.println("Roulette game");
    // Задание:
    //  Запустить "Рулетку" 20 раз. В "Рулетке" на круге 36 ячеек, куда может попасть шарик,
    //  и два цвета - красный, черный.
    //  Результат попытки вывести так:
    //  "Выиграл номер NN, четное или нечетное, цвет"

        int[] roulette = new int[20]; // задаем массив для 20 запусков рулетки, в него будем заносить ячейку, куда попал шарик
        int[] colorR = new int[20]; // задаем массив для 20 раз запусков рулетки, в него занесем цвет

        for (int i = 0; i < 20; i++) {
            roulette[i] = (int)(( Math.random() * (36 - 1 + 1) + 1)); // случайное число в интервале от 1 до 36
            colorR[i] = (int)(( Math.random() * (1 - 0 + 1) + 0)); // случайное число 0 или 1
            String s1;
            if (roulette[i]%2 == 0 ){
                s1 = "четный";
            } else {
                s1 = "нечетный";
            }
            String s2;
            if (colorR[i] == 0 ){
                s2 = " красный цвет";
            } else {
                s2 = " черный цвет";
            }

            System.out.println("Выиграл номер: " + roulette[i] + ", " + s1 + ", " + s2);

        }
    }
}