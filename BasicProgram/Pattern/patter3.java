package Pattern;

import java.util.Scanner;

public class patter3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How long you want to print");
        int n= sc.nextInt();
        
        
        for(int i=1;1<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");

            }
            System.out.println();


        }  
        System.out.println("************************");
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
