public class Main {
    public static void main(String[] args) {
        System.out.println("Пример создания класса");
        // создание класса внутри класса Main
        class Car {
            String brand; // марка - Audi, BMW, Mercedes, Opel, ...
            String type; // тип - седан, универсал, внедорожник, ...
            int capacity; // вместимость - 2, 4, 5, 7 человек
        }

        Car myCar = new Car();
        myCar.brand = "VW";
        myCar.type = "universal";
        myCar.capacity = 5;

        System.out.println("My car: " + myCar.brand + ", " + myCar.type + ", capacity " + myCar.capacity + " people.");

        // использование класса, определенного в другом файле
        Pet myPet = new Pet();
        myPet.type = "Cat";
        myPet.breed = "Burmese";
        myPet.name = "Benjamin";
        myPet.weight = 4.50;

        System.out.println("My pet: " + myPet.type + ", " + myPet.breed + ", name " + myPet.name + ", weight " + myPet.weight);
        System.out.println();
        System.out.println(myPet.toString());
        System.out.println("Вес: " + myPet.getWeight());

    }
}