import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        System.out.println("Пример наполнения TreeSet");

        TreeSet ts = new TreeSet();

        System.out.println("Пример со строками" );
        // Добавляем элементы к набору древ
        ts.add("C");
        ts.add("A");
        ts.add("J");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // Выводим на печать
        System.out.println(ts);

        System.out.println("Пример с целыми числами" );
        TreeSet tsNum = new TreeSet();
        // Добавляем элементы к набору древ
        tsNum.add("1");
        tsNum.add("5");
        tsNum.add("12");
        tsNum.add("3");
        tsNum.add("6");
        tsNum.add("10");
        tsNum.add("9");

        System.out.println(tsNum);
    }
}