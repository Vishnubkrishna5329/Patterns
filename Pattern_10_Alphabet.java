import java.util.Scanner;

public class Pattern_10_Alphabet {
    /*
     * Sample Input 1:
     * 4
     * Sample Output 1:
     * AAAA
     * BBBB
     * CCCC
     * DDDD
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                char jthChar = (char) ('A' + i - 1);
                System.out.print(jthChar);
                j++;
            }
            System.out.println();

            i++;
        }
        sc.close();
    }
}
