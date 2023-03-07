public class Main {
    public static void main(String[] args) {
        System.out.println("Класс Телефон - практикум");

        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());

        phone1.receiveCall("1234567");

        String phoneNumber = phone1.getNumber();
        System.out.println("Номер телефона: " + phoneNumber);


//        Phone phone1 = new Phone("+7903 123 45 67", "iPhone", 280);
//        Phone phone2 = new Phone("+49 176 00 000 123", "Samsung", 290);
//        Phone phone3 = new Phone("+49 152 00 000 321", "Sony", 250);
//
//        System.out.println(phone1.toString());
//        System.out.println(phone2.toString());
//        System.out.println(phone3.toString());

    }
}