import java.util.Scanner;

public class ReverseString {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter a String to reverse");
        String name = sc.next();
        String reverse = "";
        int l = name.length();
        for( int i=l-1;i>=0;i--){
            reverse = reverse + name.charAt(i);


        }
        System.out.println("Reverse String:"+ reverse);
        
    }
}
