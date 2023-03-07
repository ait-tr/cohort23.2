public class Main {
    public static void main(String[] args) {
        System.out.println("Класс Телефон - практикум");

        Phone phone1 = new Phone("+7 903 1234567", "Apple", "iPhone 11");// создание нового экземпляра класса
        Phone phone2 = new Phone("+49 176 123 456", "Samsung", "Galaxy");// создание нового экземпляра класса

        System.out.println(phone1);
        System.out.println(phone2);
    }
}