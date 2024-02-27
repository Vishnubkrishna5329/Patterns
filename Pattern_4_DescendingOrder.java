import java.util.Scanner;

public class Pattern_4_DescendingOrder {
    /*
     * Sample Input 1:
     * 7
     * Sample Output 1:
     * 7
     * 7 6
     * 7 6 5
     * 7 6 5 4
     * 7 6 5 4 3
     * 7 6 5 4 3 2
     * 7 6 5 4 3 2 1
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            count = n;
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count--;
            }
            System.out.println();
        }
        sc.close();
    }

}
