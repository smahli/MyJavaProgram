import java.util.Scanner;

public class MaxNum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("We are checking which number is greater");
            System.out.println("Please Enter First Number");
                int a = sc.nextInt();
                
            System.out.println("Please Enter Second Number");

                int b= sc.nextInt();

                if(a>b){
                    System.out.println(a+" is greater Than "+ b);
                }
                else if(a==b){
                    System.out.println(a+" and "+ b +" are equal");

                }
                else{
                    System.out.println(b+" is greater than "+a);
                }
            }            

}
