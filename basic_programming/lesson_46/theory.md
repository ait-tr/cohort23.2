## Comparator - что это и для чего?
Интерфейс Comparable 
* два объекта с одинаковыми полями и их значениями  в памяти компьютера - это разные объекты!
* Позволяет отсортировать объекты класса
* Использует интерфейс: implements Comparable<T> - это надо написать в Классе
* Применяет Comparator - метод для сравнения
* Алгоритм сравнивает значения полей Класса
* Поля бывают либо числовые, либо строчные
* Сортировка может происходить либо в математическом порядке, либо в алфавитном
* При сортировке используется алгоритм:
  * при равенстве значений в сравниваемых полях -> 0
  * при "меньше" -> -1 (отрицательное число)
  * при "больше" -> 1 (положительное число)



