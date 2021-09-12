import java.util.Scanner;

public class NumberPattern2 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);


        System.out.println(" Enter a number how long you want to print");
        int n= cs.nextInt();
        int count=0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                count=count+1;
                System.out.print(count);
        
            }
            
            System.out.println();
        }
    }
    
}
