import java.util.Scanner;

public class Pattern_17_Diamond {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int n1= (n+1)/2;
        int n2 = n1-1;
       
        while(i<=n1){
           int spaces =1;

           while(spaces<=(n1-i)){
            System.out.print(" ");
            spaces++;
           }

           int j=1;
           while(j<=(2*i)-1){
            System.out.print("*");
            j++;
           }

            System.out.println();
            i++;
        }

        i=1;
        while(i<=n2){
            int spaces =1;
            while(spaces<=i){
                System.out.print(" ");
                spaces++;
               }
    
               int j=1;
               while(j<=n-(2*i)){
                System.out.print("*");
                j++;
               }
    
                System.out.println();
                i++;
        }
        sc.close();
    }
}
