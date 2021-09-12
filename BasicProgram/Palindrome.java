import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        long rev=0;
        long rem;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to check Palindrome :");
        long n = sc.nextLong();
        long temp=n;
        while(n!=0){
            
            
            rem =(n%10);
            rev=rev*10+rem;
            n=n/10;

        }
        
        if(rev==temp){
            System.out.println(" Number Is Palindrome");

            
        }
        else{
            System.out.println(" No is not Palindrome");
        }

    }
    
}
