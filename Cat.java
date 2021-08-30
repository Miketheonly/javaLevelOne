public class Cat {
    private String name;
    private int appetite;
    private boolean hunger;

    public Cat(String name, int appetite) {
        hunger = true;
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate myPlate) {
        if (myPlate.enoughFood(appetite) && hunger) {
            myPlate.decreaseFood(appetite);
            hunger = false;
            System.out.println(name + " is eating");
        } else if (!myPlate.enoughFood(appetite)) {
            System.out.println("Not enough food to feed " + name);
        } else if (!hunger) {
            System.out.println(name + " doesn't want to eat");
        }
    }
}
