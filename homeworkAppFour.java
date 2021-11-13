import java.util.Random;
import java.util.Scanner;

public class homeworkAppFour {
    public static char[][] map;
    public static final int size = 3;
    public static final char dot_x = 'X';
    public static final char dot_o = 'O';
    public static final char dot_empty = '.';
    public static final int victoryCount = 3;

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (victoryLineCounter('X')) {
                System.out.println("Победил игрок");
                break;
            }
            if (victoryDiagonalCounter('X')) {
                System.out.println("Победил игрок");
                break;
            }
            if (mapIsFilled()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (victoryLineCounter('O')) {
                System.out.println("Победил компьютер");
                break;
            }
            if (victoryDiagonalCounter('O')) {
                System.out.println("Победил компьютер");
                break;
            }
            if (mapIsFilled()) {
                System.out.println("Ничья");
                break;
            }
        }

    }

    public static void initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = dot_empty;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("ВВедите координаты в формате x, y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[x][y] = dot_x;
    }

    public static void aiTurn() {
        int x;
        int y;
        Random rand = new Random();

        do {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        } while (!isCellValid(x, y));

        map[x][y] = dot_o;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= size || y >= size) {
            System.out.println("координаты не соответствуют формату");
            return false;
        }

        if (map[x][y] == dot_empty) {
            return true;
        }

        return false;
    }

    static boolean victoryLineCounter(char symb) {
        int rowCounter = 0;
        int colCounter = 0;
        for (int row = 0; row < size; row++) {

            for (int col = 0; col < size; col++) {
                if (map[row][col] == symb) {
                    rowCounter++;
                } else {
                    rowCounter = 0;
                }

                if (map[col][row] == symb) {
                    colCounter++;
                } else {
                    colCounter = 0;
                }
            }

            if ((rowCounter == victoryCount) || (colCounter == victoryCount))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean victoryDiagonalCounter(char symb) {
        int mainDiagCounter = 0;
        int antiDiagCounter = 0;
        for (int row = 0; row < size; row++) {
            if (map[row][row] == symb) {
                mainDiagCounter++;
            }
            if (map[row][size-1-row] == symb) {
                antiDiagCounter++;
            }
            if ((mainDiagCounter == victoryCount) || (antiDiagCounter == victoryCount))
            {
                return true;
            }
        }
        for (int row = size - 1; row == 0; row--) {
            for (int col = 0; col < size; col++) {
                if ((row == col) && (map[row][col] == symb)) {
                    antiDiagCounter++;
                }
            }
        }
        return false;
    }



    public static boolean mapIsFilled() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                if (map[i][j] == dot_empty) {
                    return false;
                }
        }
        return true;
    }
}
