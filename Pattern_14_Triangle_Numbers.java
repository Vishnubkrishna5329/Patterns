public class Pattern_14_Triangle_Numbers {
    
    public static void main(String[] args) {
        
        int n = 4;
        int i=1;
        while(i<=n){

            int spaces=1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }
            int currCol=1;
            int inc = i;
            while(currCol<=i){
                System.out.print(inc);
                currCol++;
                inc++;
            }
    
            int dec =2*(i-1);
            while(dec>=i){
               System.out.print(dec);
               dec--;
            }
            System.out.println();
            i++;
        }
    }
}
