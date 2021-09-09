package BasicProgram.Class;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = sc.nextInt();
        System.out.println("Enter second number ");

        int b =sc.nextInt();
        System.out.println(" You have entered and I plus them: "+(a+b));
    }
    
}
