import java.util.Scanner;

public class Fibonacci2 {
    static int a=0;
    static int b=1;
    int sum=0;
   
    public static void main(String[] args) {
       

       
        Scanner sc =new Scanner(System.in);
        System.out.println(" How long you print Fabonacci ");
        int n = sc.nextInt();
        System.out.println("Fabonacci :"+a);
        System.out.println("Fabonacci :"+b);

        Fibonacci2 f = new Fibonacci2();
        f.PrintFabonacci(n);
        


    }
    void PrintFabonacci(int i){
        
        
        if(i>=3){
           
            sum = a+b;
            System.out.println("Fabonacci :"+sum);
            a=b;
            b=sum;
            PrintFabonacci(i-1);
        }

       
    }
    
}
