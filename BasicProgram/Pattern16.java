import java.util.Scanner;
public class Pattern16 {
    
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number how long you want to print");
        int n = sc.nextInt();


        for(int i=1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");

            }
            for(int k=n;k>(i*2);k--){
                  if(k>1 && k<(i*2)+1){
                      System.out.print(" ");
                   }
                    else{
                        System.out.print("*");
                    } 
                                                // System.out.print("*");
            }       
            System.out.println();
           }
    }
    
}


