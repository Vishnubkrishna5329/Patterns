import java.util.Scanner;

public class Pattern_18_Pascals_Triangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;

        while(i<=n-1){

            int spaces =1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }

            int j=0;
            int value=1;
            while(j<=i){
                System.out.print(value);
                value= value*(i-j)/(j+1);
                j++;
            }

            System.out.println();
            i++;
        }

    }
}
