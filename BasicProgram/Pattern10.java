import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println(" Enter a number how long you want to print");
        int n= cs.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i>=2 && j<=i-1){
                    System.out.print(" ");

                }
                else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
    
}
