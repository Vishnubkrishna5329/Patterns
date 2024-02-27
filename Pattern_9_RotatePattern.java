import java.util.Scanner;

public class Pattern_9_RotatePattern {

    /*
     * Sample Input 1:
     * 5
     * Sample Output 1:
     * 1 2 3 4 5
     * 2 3 4 5 1
     * 3 4 5 1 2
     * 4 5 1 2 3
     * 5 1 2 3 4
     */

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        for (int i = 1; i <= n; i++) {
            p = i;
            for (int j = 1; j <= n; j++) {
                System.out.print(p + " ");
                p++;
                if (p > n) {
                    p = 1;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
