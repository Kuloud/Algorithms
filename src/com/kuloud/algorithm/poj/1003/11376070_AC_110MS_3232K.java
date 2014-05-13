import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double a = sc.nextDouble();
            if (a < 0.01) {
                break;
            } else {
                System.out.printf("%d card(s)\n", fn(1, a, 0));
            }
        }
    }

    private static int fn(int n, double a, double sum) {
        return ((sum += 1.0 / (n + 1)) < a) ? fn(n + 1, a, sum) : n;
    }
}