import java.util.Scanner;

public class NumberPattern11 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);


        System.out.println(" Enter a number how long you want to print");
        int n= cs.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
        
            }
            
            System.out.println();
        }
    }
    
}
