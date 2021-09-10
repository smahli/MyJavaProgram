package Pattern;

import java.util.Scanner;

public class patter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println(" Enter the number where to start from ");
        int n = sc.nextInt();
        System.out.println("**************************");
        System.out.println("Here you go");
        for(int i=n;i>=1;i--){
            for( int j=n;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
            n--;
        }



    }
    
}
