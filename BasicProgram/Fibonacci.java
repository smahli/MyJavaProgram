import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" How long you want to print fabonacci Series");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int sum =0;
        System.out.println("Fibonacci : "+ a);
        System.out.println("Fibonacci : "+ b);


        for(int i=1;i<=n-2;i++){
            sum=a+b;
            System.out.println("Fibonacci :"+ sum);
            a=b;
            b=sum;


        }

    }
        


}