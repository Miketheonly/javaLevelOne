import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class homeworkAppTwo {
    public static void main(String[] args) {
       boolean flag = compare(1, 8);
        System.out.println(flag);

        wholeNum(-5);

        boolean flag2 = gameNumber(-5);
        System.out.println(flag2);

        twoArgs("Спасибо, понял", 2);

        boolean flag3 = hhh(700);
        System.out.println(flag3);
    }




    public static boolean compare(int x, int y) {
        if (x+y >= 10 && x+y<20) {
            return true;
        } else {
            return false;
        }
    }

    public static void wholeNum (int a) {
        if (a >=0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean gameNumber(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void twoArgs(String message, int b) {
        for (int count = 1; count <= b; count++) {
            System.out.println(message);
        }
    }

    public static boolean hhh(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
