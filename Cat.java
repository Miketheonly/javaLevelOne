public class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    public void running(int dist) {
        if (dist > 0) {
            if (dist <= 200) {
                System.out.println(name + " ran " + dist + " meters");
            } else {
                System.out.println("Cats don't run that far");
            }
        } else {
            System.out.println("Distance value must be positive!");
        }
    }

    public void swimming() {
        System.out.println("Cats don't like to swim");
    }
}
