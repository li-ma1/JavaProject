package lesson3;

public class Employee {
    //характеристики класса
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    //конструктор
    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    //метод для вывода на печать
    public void info() {
        System.out.println("Name:" + name + "\nPosition:" + position + "\nEmail:" + email
                + "\nPhone number:" + phone + "\nSalary:" + salary + "\nAge:" + age + "\n___________________________");
    }

    //метод для ввода работников
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivanov Ivan", "PM", "ivan@gmail.com", "+375465748",
                1500, 45);
        employeesArray[1] = new Employee("Petrov Petr", "QA", "petr@gmail.com", "+37548287",
                1000, 36);
        employeesArray[2] = new Employee("Sidorov Sidor", "Dev", "sid@gmail.com", "+37654433",
                2500, 50);
        employeesArray[3] = new Employee("Romanov Roman", "AQA", "rr@gmail.com", "+375342356",
                1500, 32);
        employeesArray[4] = new Employee("Sergeev Sergey", "BA", "ser@gmai.com", "+37543327",
                1300, 25);
        //цикл и условие
        for (int i = 0; i < employeesArray.length; i++)
            if (employeesArray[i].age > 40) {
                employeesArray[i].info();
            }
    }
}

