import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println(" Enter a number how long you want to print");
        int n= cs.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");

            }
            for(int k=1;k<=n;k++){
                if (i>=2 && k<=i-1) {
                    System.out.print(" ");
                    
                }
                else{
                    System.out.print("*");
                }
                
                
                
            }System.out.println();
            
            
        
        }
    }
    
}
