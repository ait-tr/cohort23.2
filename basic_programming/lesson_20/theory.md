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

The **try** statement allows you to define a block of code to be tested for errors while it is being executed.
The **catch** statement allows you to define a block of code to be executed, if an error occurs in the try block.
The **try and catch keywords come in pairs**:
`try {
        //  Block of code to try
    }
catch(Exception e) {
    //  Block of code to handle errors
    }`

Примеры:
1. Выход за пределы массива;
2. Деление на 0.

Все исключения и ошибки пользователя можно обрабатывать самому, НО ЗАЧЕМ?
Разарботчики Java предоставляют стандартный инструментарий для этого - 
это класс Throwable (потомок класса Oject) и его методы.

### The advantages of Exception Handling in Java are as follows:

* Provision to Complete Program Execution
* Easy Identification of Program Code and Error-Handling Code
* Propagation of Errors
* Meaningful Error Reporting
* Identifying Error Types
