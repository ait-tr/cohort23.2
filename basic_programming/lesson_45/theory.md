## Интерфейс Comparable

### Проблематика:
В своей работе программисты часто сталкиваются с задачами сортировки и отображения 
отсортированного списка.  
Пример: надо отсортировать квартиры на сайте поиска квартир. 
Пользователь может сортировать их по цене, рейтингу популярности, дате публикации и т.д.

см. img ...

Как нам сравнить два объекта класса Flat?
Возьмеи более простой пример, класс Cat:
    String name;
    int age;
    double weight;
    String breed;
Как будем сравнивать кошечек?

Алгоритм:
ШАГ 1: Задаем класс, его конструктор и экземпляры.
ШАГ 2: Задаем метод compareTo, определяем в нем, 
по какому полю происходит сортировка.
ШАГ 3: Выводим на печать TreeSet c экземплярами класса.
Убеждаемся, что они отсортированы в нужном нам порядке (natural ordering). 

Синтаксис:
public class ИмяКласса implements Comparable<Имя класса>

Внутри класса имплементируем метод compareTo(T o)  

Принцип/алгоритм работы метода compareTo(T o)
Метод возвращает int:
•ноль, если два объекта равны;
•число >0 (обычно это 1), если первый объект (на котором вызывается метод) больше, чем второй (который передается в качестве параметра);
•число <0 (обычно это -1), если первый объект меньше второго.



