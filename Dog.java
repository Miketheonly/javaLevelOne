public class Dog extends Animal{
    Dog(String name, int age) {
        super(name, age);
    }
    public void running(int dist) {
        if (dist > 0) {
            if (dist <= 500) {
                System.out.println(name + " ran " + dist + " meters");
            } else {
                System.out.println("Dogs don't run that far");
            }
        } else {
            System.out.println("Distance value must be positive!");
        }
    }

    public void swimming(int dist) {
        if (dist > 0) {
            if (dist <= 10) {
                System.out.println(name + " swam " + dist + " meters");
            } else {
                System.out.println("Dogs don't swim that far");
            }
        } else {
            System.out.println("Distance value must be positive!");
        }
    }
}
