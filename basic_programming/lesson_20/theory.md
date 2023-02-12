## Exeptions, debugging

Exception - исключение, особая ситуация (перевод с английского)

### Major reasons why an exception Occurs
* Invalid user input
* Device failure
* Loss of network connection
* Physical limitations (out of disk memory)
* Code errors
* Opening an unavailable file

### Differences between Error and Exception that is as follows: 
* Error: An Error indicates a **serious problem** that a reasonable application
should not try to catch.
* Exception: Exception indicates **conditions** that a reasonable application 
**might try to catch**.

### Синтаксис
`try {
//  Block of code to try
}
catch(Exception e) {
//  Block of code to handle errors
}`
#### Пояснения 
The **try** statement allows you to define a block of code 
to be tested for errors while it is being executed.

The **catch** statement allows you to define a block of code 
to be executed, if an error occurs in the try block.
The **try and catch keywords come in pairs**:

Все исключения и ошибки пользователя можно обрабатывать самому, НО ЗАЧЕМ?
Разарботчики Java предоставляют стандартный инструментарий для этого -
это класс Throwable (потомок класса Oject) и его методы.

Примеры:
1. Деление на 0;
2. Выход за пределы массива;
3. Проверка ввода пользователя на корректность - не вводить символы вместо букв.

### Примеры
1. Деление a на b, нельзя делить на 0;
   `System.out.println("Деление на 0:");
   int a = 100;
   int b = 0;
   try {
   int div = a / b;
   } catch (Exception e) {
   System.out.println("Зачем вы делите на ноль???");
   }`
   2. Выход за пределы длины массива;
   `  int[] myNumbers = {1, 2, 3};
      try {
      System.out.println(myNumbers[10]);
      } catch (Exception e) {
      System.out.println("Вы обратились к элементу массива, индекс которого больше, чем длина массива.");
      };`
3. Калькулятор деления a на b, оформляем бесконечный цикл, защита от деления на 0 
и ввода символов вместо чисел;
4. Расчет периметра прямоугольника, защита от ввода символов вместо числа 
и ввода отрицательных чисел;
5. Использование debugger на примере задачи про шахматную доску.

### Домашнее задание