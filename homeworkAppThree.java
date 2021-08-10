import java.util.Arrays;

public class homeworkAppThree {
    public static void main(String[] args) {

        int[] y = {1, 1, 0, 0, 1, 0};
        for (int i = 0; i < y.length; i++) {
            if (y[i] == 0) {
                y[i] = 1;
            } else {
                y[i] = 0;
            }
        }
        System.out.println(Arrays.toString(y));

        int[] newArr = new int[100];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = (i + 1);
        }
        System.out.println(Arrays.toString(newArr));

        int[] z = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < z.length; i++) {
            if (z[i] < 6) {
                z[i] = (z[i] * 2);
            }
        }
        System.out.println(Arrays.toString(z));

        int[][] newSq = new int[4][4];
        for (int row = 0; row < newSq.length; row++) {
            for (int col = 0; col < newSq.length; col++) {
                if (row == col) {
                    newSq[row][col] = 1;
                }
                System.out.print(newSq[row][col]);
            }
            System.out.println();
        }
        
        System.out.println(Arrays.toString(newArr2(3, 4)));


        }
    public static int[] newArr2(int len, int initialValue) {
        int[] comp = new int[len];
        for (int i = 0; i < comp.length; i++) {
            comp[i] = initialValue;
        }
        return comp;
    }
}
