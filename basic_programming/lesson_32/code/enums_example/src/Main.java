public class Main {
    public static void main(String[] args) {
        System.out.println("Пример использования enum");
        enum Seasons {
            WINTER,
            SPRING,
            SUMMER,
            AUTUMN;
        }
                Seasons mySeason = Seasons.WINTER;

                switch(mySeason) {
                    case WINTER:
                        System.out.println("Точим лыжи!");
                        break;
                    case SPRING:
                        System.out.println("Весной наступает Пасха, красим яйца!");
                        break;
                    case SUMMER:
                        System.out.println("Планируем отпуск!");
                        break;
                    case AUTUMN: {
                        System.out.println("Готовим сани к зиме!");
                        break;
                    }
                }
    }
}