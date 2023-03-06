public class Wine {
    String name;
    String sort;
    int year;

    @Override
    public String toString() {
        return "Wine{" +
                "name='" + name + '\'' +
                ", sort='" + sort + '\'' +
                ", year=" + year +
                '}';

    }

    public int onStock(int n) {
        System.out.print("На складе имеется бутылок: " );
        return n;
    }

    public int getYear() {
        return year;
    }
}

//        Создайте класс Wine, который содержит переменные name, sort и year.
//        Создайте три экземпляра этого класса.
//        Выведите на консоль значения их переменных методом toString.

//        Добавить в класс Wine метод: onStock, имеет один параметр – количество бутылок.
//        Выводит на консоль сообщение "На складе имеется количество бутылок".

//        Задайте метод getYear – возвращает год производства вина.
//        Вызвать этот метод для каждого из объектов.
