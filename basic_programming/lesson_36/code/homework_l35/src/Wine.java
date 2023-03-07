public class Wine {
    String name;
    String sort;
    int year;

    @Override // переопределили метод
    public String toString() { // метод печатает в строку все поля класса
        return "Wine{" +
                "name='" + name + '\'' +
                ", sort='" + sort + '\'' +
                ", year=" + year +
                '}';
    }

    public String onStock(int n) {
        return ("На складе имеется " +  n + " бутылок");
    }

    public int getYear() {
        return year;
    }
}
