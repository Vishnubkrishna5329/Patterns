import java.util.Scanner;

public class Pattern_7_DownTrainglePyramid {

    /*
     * 
     * Sample Input 1:
            5
                    Sample Output 1:
                        *****
                         ****
                          ***
                           **
                            *
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = count; i >= 1; i--) {

            for (int j = count - i; j >= 1; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i) - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
}
