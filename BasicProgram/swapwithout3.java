import java.util.Scanner;

public class swapwithout3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter First number");
        int firstNum= sc.nextInt();
        System.out.println(" Enter second number");
        int secondNum = sc.nextInt();
        
        secondNum= firstNum+secondNum;
        firstNum=secondNum-firstNum;
        secondNum=secondNum-firstNum;
     
    

        System.out.println(firstNum +" and "+ secondNum +" swapped successfully");

    }
    
}
