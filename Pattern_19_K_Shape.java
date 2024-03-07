import java.util.Scanner;

public class Pattern_19_K_Shape {
    
    public static void main(String[] args) {
        		  Scanner sc = new Scanner(System.in);
       	  int n = sc.nextInt();
		  int i=1;
		  while(i<=n){
			  int j=n-(i-1);
			  while(j>=1){
				System.out.print(j+" ");
				j--;
			  }

			  i++;
			  System.out.println();
		  }
		  i=1;
		  while(i<n){
			  int j=i+1;
			  while(j>=1){
				  System.out.print(j+" ");
				  j--;
			  }

			  i++;
			  System.out.println();
		  }	 
    }
}
