
public class Main {
    public static void main(String[] args) {
        System.out.println("Контроль возраста избирателя на уровне конструктора класса");
        System.out.println();

        Voter v1 = new Voter("123456789", 15, "Willy"); // вызов конструктора объекта класса
        System.out.println(v1);
        System.out.println();
        Voter v2 = new Voter("987654321", 35, "Jhon"); // вызов конструктора объекта класса
        System.out.println(v2);
        System.out.println();
        Voter v3 = new Voter("", 47, "");

    }
}









/*
        Voter v1 = new Voter("Willy", "123456789", 45);
        System.out.println(v1);
        System.out.println();
        Voter v2 = new Voter("Andres", "987654321", 15);
 */