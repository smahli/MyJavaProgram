import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter how long you want to print");
        int n = scn.nextInt();

        for( int i=1;i<=n;i++){
            for( int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for( int k=n;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    
}