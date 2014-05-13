import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static char[] temp = new char[7];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] out = new int[num];
        for (int i = 0; i < num; i++) {
            out[i] = mapNumber(sc.next().toCharArray());
        }
        Arrays.sort(out);
        boolean hasNums = false;
        int j = 1;
        for (int i = 1; i < out.length; i++) {
            if (out[i] != out[i - 1]) {
                if (j > 1) {
                    System.out.println(out[i - 1] / 10000 + "-" + out[i - 1] % 10000 + " " + j);
                    j = 1;
                    hasNums = true;
                }
            } else {
                j++;
            }
        }
        if (j > 1) {
            System.out.println(out[out.length - 1] / 10000 + "-" + out[out.length - 1] % 10000
                    + " " + j);
        } else if (!hasNums) {
            System.out.println("No duplicates.");
        }
    }

    private static int mapNumber(char[] in) {
        int j = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] <= '9' && in[i] >= '0') {
                temp[j++] = in[i];
                continue;
            }
            if (in[i] <= 'P' && in[i] >= 'A') {
                temp[j++] = (char) ((in[i] - 'A') / 3 + '2');
            } else if (in[i] >= 'R') {
                temp[j++] = (char) ((in[i] - 'B') / 3 + '2');
            }
        }
        return Integer.valueOf(String.copyValueOf(temp));
    }

}