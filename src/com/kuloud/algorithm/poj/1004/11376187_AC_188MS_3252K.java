import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        for (int i = 0; i < 12; i++) {
            sum += sc.nextFloat();
        }
        System.out.printf("$%.2f\n", sum / 12);
    }
}