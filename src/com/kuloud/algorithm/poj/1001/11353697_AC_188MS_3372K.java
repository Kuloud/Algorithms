import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ArithmeticException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            BigDecimal r = sc.nextBigDecimal();
            int n = sc.nextInt();
            System.out.println(trimZeros(r.pow(n).toPlainString()));
        }
    }

    private static String trimZeros(String num) {
        int st = (num.charAt(0) == '0') ? 1 : 0;
        int end = num.length() - 1;
        while (num.charAt(end) == '0') {
            end--;
        }
        if (num.charAt(end) != '.') {
            end++;
        }
        if (st >= end - 1) {
            return "0";
        }
        return num.substring(st, end);
    }
}