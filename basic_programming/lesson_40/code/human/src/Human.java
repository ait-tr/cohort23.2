public class Human {
    private String firstName;
    private String lastName;

    // конструктор класса
    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // метод, который отправляет человкеа на работу
    public void work() { // название метода придумали сами
        System.out.println("Человек устроился на должность и пошел на работу!");
    }
}
