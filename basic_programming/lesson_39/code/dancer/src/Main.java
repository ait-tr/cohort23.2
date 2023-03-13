import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Пример наследования с класом Dancer");

        Dancer d1 = new Dancer("Владимир","30", "М");
        d1.dance(); // танцор танцует

        TwistDancer d2 = new TwistDancer("Дима", "25", "М");
        d2.dance(); // танцор танцует твист

        BreakDancer d3 = new BreakDancer("Анатолий", "36", "М");
        d3.dance(); // танцор танцует Break

        List<Dancer> dancers = new ArrayList<>();
        dancers.add(d1);
        dancers.add(d2);
        dancers.add(d3);

        System.out.println(dancers); // печатем лист танцоров

        // все танцоры выполняют метод dance в цикле по элементам массива
        for (int i = 0; i < dancers.size(); i++) {
            dancers.get(i).dance();
        }

    }
}