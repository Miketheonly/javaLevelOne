public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (!enoughFood(appetite)) {
            System.out.println("Not enough food to feed the cat");
        } else {
            food -= appetite;
        }
    }

    public boolean enoughFood (int appetite) {
        return appetite < food;
    }

    public void increaseFood(int amountOfFood) {
        food += amountOfFood;
    }
}
