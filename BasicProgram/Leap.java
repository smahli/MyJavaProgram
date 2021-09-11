import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        /** To check if a year is a leap year, divide the year by 4. If it is fully divisible by 4, it is a leap year. 
         * For example, the year 2016 is divisible 4, so it is a leap year, whereas, 2015 is not.
         *  However, Century years like 300, 700, 1900, 2000 need to be divided by 400 to check whether they are leap years or not. */

         Scanner sc =new Scanner(System.in);
         System.out.println("Enter a Year check if It is Leap or Not");
         int n = sc.nextInt();

         if(n%4==0){
             if(n%100==0){
                 if(n%400==0){
                     System.out.println("This is Leap Year");
                 }
                 else{
                     System.out.println("Entered year in not a Leap Year");
                 }
                 

             }
             else{
                 System.out.println("Entered a year is a Leap Year");
             }

         }
         else{
             System.out.println("Entered Year is not leap");
         }
    }
    
}
