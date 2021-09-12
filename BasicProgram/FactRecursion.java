import java.util.Scanner;

public class FactRecursion {
    int fact =1;
    public static void main(String[] args) {
       
        int result;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number you want to calculate factorial");
        int n=sc.nextInt();
        FactRecursion f = new FactRecursion();
        result = f.calcFact(n);
        System.out.println("Factorial of "+ n + " is  "+ result);
        
    }
    int calcFact(int a ){
    
        if(a>1){
            fact = fact * a;
            calcFact(a-1);
            


        }
        else if(a==0){
            return fact=0;
        }
        return fact;

    }
    
}
