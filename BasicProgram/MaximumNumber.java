import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class MaximumNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three number to check which no is greater");
        System.out.println("****************************************************");
        System.out.println("Enter first no ");
        int a = sc.nextInt();
        System.out.println("Enter second  no ");
        int b = sc.nextInt();

        System.out.println("Enter third no ");
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a+ " is Maximum ");
            }
            else if(a==c){
                System.out.println(a+" and "+ c+ " are equal");
            }
            else{
                System.out.println(c+" is Maximum");
            }


    
        }
        else if(a==b){
            if(b>c){
                System.out.println(b+" Is Maximum");
            }
            else if(b==c){
                System.out.println(a+""+ b+""+ c +" All are equal");
            }
            else{
                System.out.println(c+"is Maximum");
            }
        }
        else{
            if(b>c){
                System.out.println(b+" is maximum");

            }
            else if(b==c){
                System.out.println(b+""+c+" A is Maximum");
            }
            else{
                System.out.println(c+"is Maximum");
            }
        }



    }
    
}
