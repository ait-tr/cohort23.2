public class Programmer extends Human {

    // конструктор класса
    public Programmer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void work() {// этот метод мы переопределяем
        System.out.println("Программист любит писать код");
        doCode(); // это еще один метод, который мы придумали
    }

    // реализация метода doCode
    public void doCode() {
        System.out.println("Сидим за клавиатурой, думаем и печатаем код.");
    }
}
