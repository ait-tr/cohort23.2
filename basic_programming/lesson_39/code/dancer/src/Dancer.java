import java.security.SecureRandom;

public class Dancer {
    String name;
    String age;
    String sex;


    public void dance() {
        System.out.println(toString() + " двигается под музыку...");
    }

    public Dancer(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Танцор " +
                "имя ='" + name + '\'' +
                ", возраст ='" + age + '\'' +
                ", пол ='" + sex + '\'' +
                ' ';
    }
}
