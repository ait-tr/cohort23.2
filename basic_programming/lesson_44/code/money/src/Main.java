public class Main {
    public static void main(String[] args) {
        System.out.println("Сравнение для класса Money");

        Money m1 = new Money(1000, "usd");
        m1.toString();
        System.out.println(m1);

        Money m2 = new Money(1000, "eur");
        Money m3 = new Money(1000, "usd");



        System.out.println( m3.equals(m1));

        System.out.println(m1.equals(m2));


        // создать еще элементы (объекты) класса Money
        // придумать пример, когда мы какие-то деньги сравниваем с каими-то другими деньгами
        //

    }
}