import java.util.Scanner;

public class Pattern_12_Inverted_Number {

    public static void main(String[] args) {

        /*
         * Sample Input 1:
         * 5
         * Sample Output 1:
         * 55555    
         * 4444
         * 333
         * 22
         * 1
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int num = n;
        while (i <= n) {
            int j = 1;

            while (j <= n - i + 1) {
                System.out.print(num);
                j++;
            }
            num--;

            System.out.println();
            i++;
        }
        sc.close();

    }
}
