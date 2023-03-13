public class Main {
    public static void main(String[] args) {

        System.out.println("Площади фигур");
        // круг
        double r = 10;
        Circle o1 = new Circle("circle", r);
        double s_circle = o1.square(); // вызываем метод для расчета площади
        System.out.println("Площадь круга: " + s_circle);

        // прямоугольник
        double a = 10;
        double b = 20;

        Rectangle rec1 = new Rectangle("rectangle", a, b);
        double s_rectangle = rec1.square(); // вызываем метод для расчета площади
        System.out.println("Площадь круга :" + s_rectangle);

        // треугольник
        double width = 100;
        double h = 200;

        Triangle tr1 = new Triangle("triangle", width, h);
        double s_tr = tr1.square();
        System.out.println("Площадь треугольника:" + s_tr);


        // трапеция
        Trapezoid trap1 = new Trapezoid("", 10, 30, 20);
        double s_trap = trap1.square();
        System.out.println("Площадь тррапеции:" + s_trap);
    }
}