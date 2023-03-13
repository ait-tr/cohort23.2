public class BreakDancer extends Dancer{
    // конструктор вытащил поля родительского класса
    public BreakDancer(String name, String age, String sex) {
        super(name, age, sex);
    }

    @Override
    public void dance() {
        System.out.println(toString() + "двигается под музыку, при этом он двигается как робот.");
    }
}
