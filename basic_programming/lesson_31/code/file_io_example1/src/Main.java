import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Main {
    public static void main(String[] args) throws IOException {

        // Создание нового файла
        System.out.println("Пример работы с файлом - СОЗДАНИЕ НОВОГО ФАЙЛА");

        String path = "/Users/leonidk/Library/Mobile Documents/com~apple~CloudDocs/Documents/Моя работа/Курс Java Core/cohort23.2/basic_programming/lesson_31/code/file_example1/src/";

        try {
        File myFile = new File(path + "test.txt"); // Укажите свое имя файла

        if (myFile.createNewFile()) {
            System.out.println("Файл создан: " + myFile.getName());
        } else {
            System.out.println("Файл уже существует.");
        }
        } catch (IOException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }

        // Запись в файл текста
        System.out.println("Пример работы с файлом - ЗАПИСЬ в ФАЙЛ");

        try {
            FileWriter myWriter = new FileWriter(path + "test.txt");
            myWriter.write("Это пробная запись текста в файл.");
            myWriter.close();
            System.out.println("Успешная запись в файл.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }

        // Чтение текста из файла
        System.out.println("Пример работы с файлом - ЧТЕНИЕ из ФАЙЛА");

        try {
            File myFile = new File(path + "test.txt");
            Scanner myReader = new Scanner(myFile); // готовим сканер для чтения
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine(); // считываем строку
                System.out.println(data); // печатаем считанную строку
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }

    }
}
