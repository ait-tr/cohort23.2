public class Voter {
    String name;
    String ID_num;
    int Age;

    public Voter(String name, String ID_num, int age) {
        this.name = name;
        this.ID_num = ID_num;
        if (age > 16) {
            Age = age;
        } else {
            System.out.println("Избиратель еще не может голосовать.");
        }
    }

    @Override
    public String toString() {
        return "Voter{" +
                "name='" + name + '\'' +
                ", ID_num='" + ID_num + '\'' +
                ", Age=" + Age +
                '}';
    }
}
