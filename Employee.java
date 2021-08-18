public class Employee {
    String cred;
    String title;
    String email;
    String phone;
    int sal;
    int age;

    Employee (String cred, String title, String email, String phone, int sal, int age) {
        this.cred = cred;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.sal = sal;
        this.age = age;
    }

    void info () {
        System.out.println(cred);
        System.out.println(title);
        System.out.println(email);
        System.out.println(phone);
        System.out.println(sal);
        System.out.println(age);
    }
}
