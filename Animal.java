public class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void running() {
        System.out.println(name + " running");
    }

    public void swimming() {
        System.out.println(name + " swimming");
    }
}
