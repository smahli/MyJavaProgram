import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number how long you want to print");
        int n= sc.nextInt();

        for( int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                if(i>=1 && j>=i+1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
            
        }
        
    }
    
}
