import java.util.Scanner;

public class Pattern_8_HollowNumber_Square {

    /*
     * Sample Input 1:
     * 5
     * Sample Output 1:
     * 12345
     * 1   2
     * 1   2
     * 1   2
     * 12345
     */

    public static void main(String[] args) {
        // write your code here !!

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int p = 1;
        int j = 0;
        for (int i = 1; i <= num; i++) {
            p = 1;
            for (j = 1; j <= num; j++) {
                if (i == 1 || i == num) {
                    System.out.print(p);
                    p++;
                } else {

                    if (j == 1 || j == num) {
                        System.out.print(p);
                        p++;
                    } else {
                        System.out.print(" ");
                    }

                }

            }
            System.out.println();
        }
        sc.close();
    }
}
