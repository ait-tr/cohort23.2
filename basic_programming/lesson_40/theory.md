## Полиморфизм в Java
Полезная статья:
https://javarush.com/groups/posts/polimorfizm-v-java 

### Определение
Вариант 1
Полиморфизм - это возможность применения **одноименных методов** с одинаковыми или различными 
наборами параметров в одном классе или в группе классов, связанных отношением наследования.

Вариант 2
Полиморфизм — способность объекта выполнять специализированные действия на основе его типа 
— это то, что делает Java—код гибким.

**Примеры:**
Это разные методы, так как они принимают на вход различные параметры:
public void myMethod (int a) { 
...
}
public void myMethod (String a) { 
...
}
хотя эти методы и называются одиаково.

Называть методы одинаково - это очень удобно. Например, если у нас есть метод, 
который ищет корень квадратный из числа, гораздо легче запомнить одно название (например, sqrt()), 
чем по одному отдельному названию на этот же метод, написанный для каждого типа числовых переменных.

**Полиморфизм позволяет :**
изменить поведение методов родительского класса ("переопределение методов");
или создавать "одноименные методы" в одном классе ("перегрузка методов").

