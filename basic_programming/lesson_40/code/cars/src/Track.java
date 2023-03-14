public class Track extends Car{
    String brand;
    int load_weight;

    public Track(int age, String usage, String brand, int load_weight) {
        super(age, usage);
        this.brand = brand;
        this.load_weight = load_weight;
    }


}
