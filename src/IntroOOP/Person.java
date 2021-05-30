package IntroOOP;

public class Person {
    String FullName;
    String position;
    String email;
    String PhoneNumber;
    int salary;
    int age;

    public Person (String FullName, String position, String email, String PhoneNumber, int salary, int age){
        this.FullName = FullName;
        this.position = position;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void Information (){
        System.out.println("ФИО: " + FullName +
                "\nДолжность: " + position +
                "\nEmail: " + email +
                "\nНомер телефона: " + PhoneNumber +
                "\nЗарплата: " + salary +
                "\nВозраст: " + age);
    }

}
