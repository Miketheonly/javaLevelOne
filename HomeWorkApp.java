public class HomeWorkApp {
    public static void main(String[] args) {
        addThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
        public static void addThreeWords() {
            String firstItem = "Orange";
            String secondItem = "Banana";
            String thirdItem = "Apple";
            System.out.println(firstItem);
            System.out.println(secondItem);
            System.out.println(thirdItem);
        }

        public static void checkSumSign() {
            int a = -21;
            int b = 21;
            int c = a + b;
            if (c > 0 || c == 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }

        public static void printColor() {
        int value = -55;
        if (value < 0 || value == 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
        }

        public static void compareNumbers() {
        int a = 5;
        int b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        }
    }