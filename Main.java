import java.util.Random;

public class Main {

    public static int diceRole, n, m, a, b, c, d;

    public static void main(String[] args) {
	// write your code here
        senario1();
        senario2();
        senario3();
        senario4();
        senario5();
    }

    public static void senario1() {

        Random rand = new Random();
        float expected = (float) 3 / 6;
        System.out.printf("Senario 1\nExpected Result: %.4f", expected);
        n = 0;
        m = 0;
        for (int i = 1; i<100001; i++) {
            diceRole = rand.nextInt(6)+1;
            if (diceRole%2 == 0) {
                m++;
            }
            else {
                n++;
            }
        }
        System.out.println("\nCount of True: " + n);
        System.out.println("Count of False: " + m);
        System.out.println("Condition Reached " + (double)n/100000);
    }

    public static void senario2() {

        Random rand = new Random();
        float expected = (float) (2 + 5) / 10;
        System.out.printf("\nSenario 2\nExpected Result: %.4f", expected);
        n = 0;
        m = 0;
        for (int i = 1; i < 100001; i++) {
            diceRole = rand.nextInt(10) + 1;
            if (diceRole % 2 == 0) {
                n++;
            }
            else {
                if (diceRole > 5) {
                    n++;
                }
            }
        }
            System.out.println("\nCount of True: " + n);
            System.out.println("Count of False: " + (100000-n));
            System.out.println("Condition Reached " + (double) n / 100000);
    }

    public static void senario3() {

        Random rand = new Random();
        double expected = (3.00 / 6.00)*(3.00 / 6.00);
        System.out.printf("\nSenario 3\nExpected Result: %.4f", expected);
        n = 0;
        m = 0;
        for (int i = 1; i<100001; i++) {
            diceRole = rand.nextInt(6)+1;
            if (diceRole%2 == 0) {
                diceRole = rand.nextInt(6)+1;
                if (diceRole%2 == 0) {
                    n++;
                }
            }
        }
        System.out.println("\nCount of True: " + n);
        System.out.println("Count of False: " + (100000-n));
        System.out.println("Condition Reached " + (double)n/100000);
    }
    public static void senario4() {

        Random rand = new Random();
        double expected = (2.00 / 6.00)*(2.00 / 6.00);
        System.out.printf("\nSenario 4\nExpected Result: %.4f", expected);
        n = 0;
        m = 0;
        for (int i = 1; i<100001; i++) {
            diceRole = rand.nextInt(6)+1;
            if (diceRole == 1 || diceRole == 2) {
                diceRole = rand.nextInt(6)+1;
                if (diceRole == 3 || diceRole == 4) {
                    n++;
                }
            }
        }
        System.out.println("\nCount of True: " + n);
        System.out.println("Count of False: " + (100000-n));
        System.out.println("Condition Reached " + (double)n/100000);
    }
    public static void senario5() {

        Random rand = new Random();
        double expected = (6.0000/6.0000)*(5.0000/6.0000)*(4.0000/6.0000)*(3.0000/6.0000);
        System.out.printf("\nSenario 5\nExpected Result: %.4f", expected);
        n = 0;
        m = 0;
        for (int i = 1; i<100001; i++) {
            a = rand.nextInt(6)+1;
            b = rand.nextInt(6)+1;
            c = rand.nextInt(6)+1;
            d = rand.nextInt(6)+1;
            if ((a != b && a != c && a != d) && (b != c && b != d) && (c != d)) {
                n++;
            }
        }
        System.out.println("\nCount of True: " + n);
        System.out.println("Count of False: " + (100000-n));
        System.out.println("Condition Reached " + (double)n/100000);
    }
}
