public class Phone {
    String number;
    String brand;
    double weight;

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", brand='" + brand + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void receiveCall(String name){
        System.out.println("Звонит: " + name);
    }

    public String getNumber() {
        return number;
    }

    public Phone(String number, String brand, double weight) {
        this.number = number;
        this.brand = brand;
        this.weight = weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public double getWeight() {
        return weight;
    }
}
