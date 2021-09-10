import jdk.nashorn.internal.parser.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("How long you want print");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=n;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
            n--;
        }

        


        }
    
}
