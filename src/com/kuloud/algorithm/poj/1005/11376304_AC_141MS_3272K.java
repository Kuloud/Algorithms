import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            float x = sc.nextFloat();
            float y = sc.nextFloat();
            System.out.printf("Property %d: This property will begin eroding in year %d.\n", i,
                    (int) (Math.PI * (x * x + y * y) / 100) + 1);
        }
        System.out.println("END OF OUTPUT.");
    }
}