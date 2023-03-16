public class Main {
    public static void main(String[] args) {
        System.out.println("Доступ к полям класса (модификаторы public, private ...)");

        Person person = new Person("Kate",32,"Baker Street, 26", "+1234567");
        person.displayName();
        person.displayAge(); // не виден, когда в другом пакете
        person.displayPhone(); // не виден, когда в другом пакете
        // person.displayAddress();  ! Ошибка, метод private
    }
}



/*
Person kate = new Person("Kate", 32, "Baker Street", "+12334567");
        kate.displayName();     // норм, метод public
        kate.displayAge();      // норм, метод имеет модификатор по умолчанию
        kate.displayPhone();    // норм, метод protected
        //kate.displayAddress();  // ! Ошибка, метод private

        System.out.println(kate.name);      // норм, модификатор по умолчанию
        System.out.println(kate.address);   // норм, модификатор public
        System.out.println(kate.age);       // норм, модификатор protected
        //System.out.println(kate.phone);   // ! Ошибка, модификатор private
 */