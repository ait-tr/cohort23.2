public class Main {
    public static void main(String[] args) {
        System.out.println("Работаем с классами");

        Wine myWine1 = new Wine();
        myWine1.name = "Casillero del Diabolo";
        myWine1.sort = "Каберне";
        myWine1.year = 2016;

        Wine myWine2 = new Wine();
        myWine2.sort = "Petrus";
        myWine2.name = "Мерло";
        myWine2.year = 2022;

        Wine myWine3 = new Wine();
        myWine3.name = "Rioja Vega";
        myWine3.sort = "Риоха";
        myWine3.year = 2019;

        System.out.println(myWine1.toString());
        System.out.println(myWine2.toString());
        System.out.println(myWine3.toString());

        System.out.println(myWine1.onStock(3));
        System.out.println(myWine2.onStock(2));
        System.out.println(myWine3.onStock(5));

        System.out.println(myWine1.getYear());
        System.out.println(myWine2.getYear());
        System.out.println(myWine3.getYear());


        Pet pet1 = new Pet("кошка", "британка", "Василиса", 4 );
        Pet pet2 = new Pet("собака", "пудель", "Артемон", 10 );

        System.out.println("Мои домашние питомцы: ");
        System.out.println(pet1);
        System.out.println(pet2);

    }
}

