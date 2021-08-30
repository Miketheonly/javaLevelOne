public class homeworkAppSeven {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Dusya", 4),
                new Cat("Varya", 10),
                new Cat("Wiggles", 7)
        };

        Plate myPlate = new Plate(19);

        for (Cat cat : cats) {
            cat.eat(myPlate);
        }

        myPlate.increaseFood(40);

        for (Cat cat : cats) {
            cat.eat(myPlate);
        }
    }
}
