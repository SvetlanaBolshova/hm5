package HM5Bolshova;

/*
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
4. Создать массив из 5 сотрудников.
5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
*/
public class task {
    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "894536855",50000,41);
        empCorp[1] = new Employee("Kireenko Anton", "Creator", "Kireenko@mailbox.com", "892457256",50000,32);
        empCorp[2] = new Employee("Bolshova Svetlana", "Nurse", "bolshova@mailbox.com", "89000000",10000,22);
        empCorp[3] = new Employee("Mosina Lidiya", "Nurse", "Mosina@mailbox.com", "89678565",5000,18);
        empCorp[4] = new Employee("Petrov Vasilii", "Scientist", "petrov@mailbox.com", "8924569885",3000,45);
        for (Employee employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}