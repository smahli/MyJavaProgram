import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome to calculator");
        System.out.println(" Which operation you want to performn in calculator(+ - * /  and %)");
        char Symbol = sc.next().charAt(0);
        System.out.println(" Enter first number ");
        int firstNum= sc.nextInt();
        System.out.println(" Enter second number ");
        int secondNum = sc.nextInt();

        switch(Symbol){
            case'+' :
                 result = firstNum + secondNum;
                 System.out.println("Result:"+ result);
            break;
            case '-':
                result = firstNum - secondNum;
                System.out.println("Result:"+ result);
                break;
            case '*':
                result = firstNum * secondNum;
                System.out.println("Result:"+ result);
                break;
            case '/':
            if(secondNum==0){
                System.out.println(" Cannot divisible by 0");
              
            }
            else{
                    result = firstNum/ secondNum;
                    System.out.println("Result:"+ result);
            }
            break;
            case'%':
            result = firstNum%secondNum;
            break;
            default:
            System.out.println("Invalid Symbol");
            break;
            

        }
        
    }
    
}
