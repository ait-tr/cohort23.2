public class Salary extends Employee {
    // переменная для хранения зарплаты
    private double salary;

    // конструктор для объекта класса Salary
    public Salary(String name, String email, int ID_num, double salary) {
        super(name, email, ID_num);
        this.salary = salary;
    }

    // метод отправляет работнику информацию о зарплате на его e-mail
    public void mailPaySlip() {
        System.out.println("Это метод класса Salary, который наследует от Employee и уточняет метод mailPaySlip");
        System.out.println("Уважаемый " + getName() + ", направляем вам информацию о зарплате на адрес " + getEmail());
        System.out.println("Ваша годовая зарплата: " + salary);
        System.out.println("Ваша месячная зарплата: " + salary/12);
    }

    // getter для переменной salary
    public double getSalary() {
        return salary;
    }

    // setter устанавливает величину годовой зарплаты
    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }

}
