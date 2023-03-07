public class Main {
    public static void main(String[] args) {
        System.out.println("Работаем с классами");

        Wine myWine1 = new Wine();
        myWine1.name = "ЛяЛя Вино";
        myWine1.sort = "каберне";
        myWine1.year = 1994;

        Wine myWine2 = new Wine();
        myWine2.name = "Тополя Вино";
        myWine2.sort = "мерло";
        myWine2.year = 2004;

        Wine myWine3 = new Wine();
        myWine3.name = "Киндзмараули";
        myWine3.sort = "саперави";
        myWine3.year = 1987;

       System.out.println(myWine1.onStock(10));
       System.out.println(myWine2.onStock(20));
       System.out.println(myWine3.onStock(25));

        System.out.println(myWine1.getYear());
        System.out.println(myWine2.getYear());
        System.out.println(myWine3.getYear());


//        Pet pet1 = new Pet("кошка", "британка", "Василиса", 4 );
//        Pet pet2 = new Pet("собака", "пудель", "Артемон", 10 );
//
//        System.out.println("Мои домашние питомцы: ");
//        System.out.println(pet1);
//        System.out.println(pet2);

    }
}

