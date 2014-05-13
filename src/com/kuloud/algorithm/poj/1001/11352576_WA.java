import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            BigDecimal r = sc.nextBigDecimal();
            int n = sc.nextInt();
            System.out.println(r.pow(n).stripTrailingZeros().toPlainString());
        }
    }

}