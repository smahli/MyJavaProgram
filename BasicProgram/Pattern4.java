import java.util.Scanner;

public class Pattern4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" How long you want print");
        int n = sc.nextInt();

        for(int i =1; i<=n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("");
            }
            System.out.println();
            for(int k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
