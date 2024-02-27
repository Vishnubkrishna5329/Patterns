import java.util.Scanner;

public class Pattern_2_SquareNumbers {
    /*
     * Sample Input1:
     * 5
     * Sample Output 1:
     * 54321
     * 54321
     * 54321
     * 54321
     * 54321
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {

            for (int j = num; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();

    }
}
