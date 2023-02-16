### ArrayList vs Array - Pros and Cons
(дискуссия, обмен мнениями)










### ArrayList - это динамический массив?
На самом деле, ArrayList "на лету" создает новый массив, он не меняет размер старого,
и переносит в него содержимое старого массива.
Размер массива ни в одном языке программирования изменить нельзя.


### ArrayList - прямое заполнение методом asList
ArrayList<String> namesList = new ArrayList<String>(
    Arrays.asList("Peter","Vladimir","Stepan"));
System.out.println(namesList);

### Вывод ArrayList в цикле for each
for (type var : array) {
    statements using var;
    }

### Изменение ArrayList в цикле for each
пример от Абу-Бакара

### Обратная сортировка ArrayList
ArrayList<String> mylist = new ArrayList<String>();
    mylist.add("practice");
    mylist.add("code");
    mylist.add("quiz");
System.out.println("Original List : " + mylist);
Collections.reverse(mylist);
System.out.println("Reversed List: " + mylist);

### example1
Что означают индексы -1 ? 

### LinkedList
Связный список - список на основе узлов. 
Каждый элемент списка случайным образом размещен в памяти, 
НО при этом каждый элемент списка "знает" о расположении других.

1-й элемент содержит ссылку на 2-й
..
n-й элемент содержит ссылки на n - 1 (предыдущий) и n + 1 (следующий) элементы
...
последний элемент содержит ссылку на предыдущий
#### Примеры:
https://gyansetu-core-java-for-java.gitbook.io/project/untitled-1/linkedlist-operations 