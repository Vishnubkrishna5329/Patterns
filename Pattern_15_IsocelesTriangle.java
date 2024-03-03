public class Pattern_15_IsocelesTriangle{

    public static void main(String[] args) {
        
        int n = 4;
        int i=1;

        while(i<=n){

            int spaces = 1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }


            int p=1;
            while(p<=i){
                System.out.print(p);
                p++;
            }

           int dec= i-1;
           while(dec>=1){
                System.out.print(dec);
                dec--;
           }

            System.out.println();
            i++;
        }
    }
}