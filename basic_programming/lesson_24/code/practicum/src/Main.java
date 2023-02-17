import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Разделить предложение по словам и записать их в ArrayList :");
        // Предложение: Все счастливые семьи похожи друг на друга, каждая несчастливая семья несчастлива по-своему.
        // На входе - Предложение
        // На выходе - распечатать ArrayList, в котором содержаться слова из предложения
        // Интерфейст - вырожденный (минимум)
        // Ключевой алгоритм - идем по строке и ищем "пробел",
        // когда найден пробел count++ , количество слов = count + 1.

        String sentence = "Все счастливые семьи похожи друг на друга, каждая несчастливая семья несчастлива по-своему.";

        String[] s = sentence.split(" "); // пробел указан в кавычках!!

        for ( int i = 0 ; i < s.length  ; i++ ) {
            System.out.print(s[i] + " | ");
        }
        System.out.println();

        ArrayList<String> sentenceWords = new ArrayList<String>();
        for ( int i=0 ; i <  s.length ; i++ ) {
            sentenceWords.add(i , s[i]);
        }
        System.out.print(sentenceWords);
    }
}















/*      Задача 1. - решена Леонидом
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

       //Вывести слово задом наперед. Пример: решена на уроке
        //На входе - Дано слово "троллейбус"
        //На выходе - Результат работы программы "cубйеллорт"
        // Что сделать - перставить буквы в слове
        // Ключевой алгоритм - "разобрать" слово по буквам
        // "Развернуть" массив задом наперд:
        // Берем последнюю букву и записываем ее в начало НОВОГО массива (на 0 индекс)
        // Предпоследнюю букву надо будет записать на индекс 1
        // Предпредпоследнюю надо буде записать на индекс 2
        // и т.д.
        // в новом массиве
        // используем для этого цил for
        //  ArrayList<String> letters = new ArrayList<String>();

        String word = "троллейбус";
        System.out.println(word);

        int lengthOfWord = word.length();
        System.out.println("Длина слова " + lengthOfWord + "символов.");

        ArrayList<Character> letters = new ArrayList<>();

        for ( int i = 0  ; i < lengthOfWord ; i++ ) { // цикл по длине слова
            // присвоить 0 элементу массива первую быкву
            // присвоить 1 элементу массива вторую букву
            // и т.д.
            letters.add( i, Character.valueOf(word.charAt(i))); // отрываем от word по одной букве
        }
        System.out.println(letters); // печать листа

        ArrayList<Character> lettersReverce = new ArrayList<>();

        for ( int i = 0 ; i < lengthOfWord   ; i++ ) {
            lettersReverce.add(  i,  letters.get(lengthOfWord - 1 - i));
        }
        System.out.println("Слово задом наперед ");
        System.out.println( lettersReverce); // печать листа

        for ( char ch: lettersReverce ) {
            System.out.print(ch);
        }

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