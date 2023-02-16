import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задача 1. Вывести слово задом наперед. Пример:
        //Дано слово "троллейбус"
        //Результат работы программы "cубйеллорт"








/*      Задача 1.
        String word = "троллейбус"; // задаем слово
        int lengthOfWord = word.length(); // определяем длину слова
        System.out.println("Длина слова = " + lengthOfWord); // вывод длины слова

        ArrayList<String> letters = new ArrayList<String>(); // создаем массив для букв из слова
        // Цикл в котором заполняем лист буквами из слова
        for (int i = 0; i < lengthOfWord; i++) {
            letters.add(String.valueOf(word.charAt(i))); // из слова берем каждую букву
        }
        System.out.println(letters); // вывод листа букв, из которых состоит слово

        ArrayList<String> lettersRev = new ArrayList<String>(); // создаем новый массив для слова наоборот
        // цикл, в котором будем
        // зписывать в 1-й элемент листа lettersRev
        // последний элемент листа letters, потом во 2-й предпоследний и т.д.
        for (int i = 0; i < lengthOfWord; i++) {
            String st = letters.get(lengthOfWord - 1 - i);
            lettersRev.add(i, st);  // заполняем лист буквами в обратном порядке
        }
        System.out.println(lettersRev); //печать листа

        // Задача 2. Подсчитать количество слов в предложении, занести слова из
        // предложения в ArrayList (слова разделены пробелами, знаки препинания не учитываются)
        // Предложение: Все счастливые семьи похожи друг на друга, каждая несчастливая семья несчастлива по-своему.
        // Ключевой алгоритм - ищем пробелы и подсчитываем их количество.

        // задаем предложение
        String sentence = "Все счастливые семьи похожи друг на друга, каждая несчастливая семья несчастлива по-своему.";
        int lengthOfSentence = sentence.length(); // длина предложения
        int count = 0; // счетчик пробелов
        // проходим циклом по всей длине предложения, если найден " ", то count++
        for (int i = 0; i < lengthOfSentence; i++) {
                int st = sentence.charAt(i);
                if (st == ' ') {
                    count++;
                }
        }
        System.out.println("В предложении " + count + " пробелов и " + (count + 1) + " слов.");

        String[] s = sentence.split(" "); // преобразуем предложение в массив слов
        // проверочная печать
        for (int i = 0; i < s.length; i++) {
            // System.out.print(s[i] + " | ");
        }
        System.out.println();
        // Заносим слова в список
        ArrayList<String> wordsInSentence = new ArrayList<String>();
        for (int i = 0; i < count + 1; i++) {
            wordsInSentence.add(i, s[i]);
        }
        System.out.println(wordsInSentence);
    }
}

 */