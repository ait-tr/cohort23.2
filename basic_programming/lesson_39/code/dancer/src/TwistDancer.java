public class TwistDancer extends Dancer{
    // конструктор вытащил поля родительского класса
    public TwistDancer(String name, String age, String sex) {
        super(name, age, sex);
    }

    @Override
    public void dance() {
        System.out.println(toString() + "двигается под музыку, при этом он активно скручивает свое тело, приседает и как бы тушит носком ноги окурок на полу.");
    }
}
