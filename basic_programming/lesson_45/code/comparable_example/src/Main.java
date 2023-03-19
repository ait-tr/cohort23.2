import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сравнение Домов:");

        TreeSet<House> houses = new TreeSet<House>();

        House h1 = new House(100, 120000, "Tokyo", true);
        House h2 = new House(40, 70000, "Oxford", true);
        House h3 = new House(70, 180000, "Paris", false);
        House h4 = new House(50, 90000, "Moscow", false);

        houses.add(h1);
        houses.add(h2);
        houses.add(h3);
        houses.add(h4);

        for (House h: houses) {
            System.out.println(h);
        }

    }
}