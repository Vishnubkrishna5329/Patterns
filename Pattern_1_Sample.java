import java.util.Scanner;

public class Pattern_1_Sample {

    /*
     * Sample Input1:
     * 5
     * Sample Output 1:
     * #####
     * #####
     * #####
     * #####
     * #####
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        sc.close();
    }

}