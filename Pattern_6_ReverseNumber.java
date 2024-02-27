import java.util.Scanner;

public class Pattern_6_ReverseNumber {
    /*
     * Sample Input 1:
     * 5
     * Sample Output 1:
     * 1
     * 21
     * 321
     * 4321
     * 54321
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        for (int i = 1; i <= n; i++) {
            p = i;// Re-initialize
            for (int j = 1; j <= i; j++) {
                System.out.print(p);
                p--;
            }
            System.out.println();
        }
        sc.close();
    }

}