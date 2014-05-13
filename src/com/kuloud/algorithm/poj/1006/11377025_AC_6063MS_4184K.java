import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int a;
        while (sc.hasNext()) {
            if ((a = sc.nextInt()) < 0) {
                break;
            }
            System.out.printf("Case %d: the next triple peak occurs in %d days.\n", ++count,
                    ((5544 * a + 14421 * sc.nextInt() + 1288 * sc.nextInt() - 7756980 - sc
                            .nextInt()) % 21252 + 21252));
        }
    }
}