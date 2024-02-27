import java.util.Scanner;

public class Pattern_5_Pyramid {

    /*
     * Sample Input 1:
     * 5
     * Sample Output 1:
     *     1
     *    2 2
     *   3 3 3
     *  4 4 4 4
     * 5 5 5 5 5
     */
    public static void main(String ar[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // First loop for white space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Loop for printing numbers
            for (int k = 1; k <= (2 * i) - i; k++) {
                System.out.print(" " + i);
            }

            System.out.println();
        }
        sc.close();

    }
}
