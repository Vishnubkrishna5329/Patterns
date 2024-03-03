public class Pattern_16_Hour_Glass {
    
    public static void main(String[] args) {
        
        int n =5;
        int i=1;

        while(i<=n){
            int spaces =1;
            while( spaces<=i-1){
                System.out.print(" ");
                spaces++;
            }
            int j=i;
            while(j<=n){
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
            i++;
        }
        i=n-1;
        while(i>=1){
            int spaces =1;
            while( spaces<=i-1){
                System.out.print(" ");
                spaces++;
            }
            int j=i;
            while(j<=n){
                System.out.print(j+" ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
