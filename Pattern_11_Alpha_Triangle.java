import java.util.Scanner;

public class Pattern_11_Alpha_Triangle {

    public static void main(String[] args) {
        /*
         * Sample Input 1:
         * 8
         * Sample Output 1:
         * H
         * GH
         * FGH
         * EFGH
         * DEFGH
         * CDEFGH
         * BCDEFGH
         * ABCDEFGH
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        char value = 'A';
        while (i <= n) {
            char newChar = (char) (value + n - i);
            int j = 1;
            while (j <= i) {
                System.out.print(newChar);
                j++;
                newChar++;
            }

            System.out.println();
            i++;
        }
        sc.close();
    }
}
