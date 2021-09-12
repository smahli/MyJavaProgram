import java.util.Scanner;

public class ReverseNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a Number you want to reverse");
        long n = sc.nextLong();
        long reverse =0;
        
        while(n !=0){
            long rem = n % 10;
             reverse = reverse * 10 + rem;
             n= n/10;

        }
        System.out.println("Reverse No:"+ reverse);
    }
}
