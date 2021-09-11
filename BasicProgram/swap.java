import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter First number");
        int firstNum= sc.nextInt();
        System.out.println(" Enter second number");
        int secondNum = sc.nextInt();
        int temp;
        temp=firstNum;
        firstNum=secondNum;
        secondNum=temp;

        System.out.println(firstNum +" and "+ secondNum +" swapped successfully");

    }
    
}
