package BankingApps;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Bal=0;
        

        System.out.println("Welcome to Banking Applictaion");
        System.out.println("Press 1 to check balance");
        System.out.println("Press 2 to withdarw money");
        System.out.println("Press 3 to credit money to your account");
        System.out.println("Press 4 to Transfer money to Another account");
        
        int switch_handler = sc.nextInt();

        switch(switch_handler){
            case 1:
            if(Bal==0){
            System.out.printf("Your current balance is :"+Bal);
            break;
            }
            else{
                System.out.printf("Your current balance is :"+ Bal);

            }
            break;

            case 2:
            if(Bal==0){
                System.out.println("You have insufficient Balance Kindly check your balance");
            }
            else{ 
                System.out.println();
                int MoneyWithdraw= sc.nextInt();
                System.out.println(" You have successfully withdrew "+ MoneyWithdraw +" Rupees");
                Bal = Bal-MoneyWithdraw;
            }

            case 3:
            System.out.println("How much you want to credit");
            int Moneycredit = sc.nextInt();
            Bal = Bal+ Moneycredit;
            break;
           
            case 4:
            if(Bal==0){
                System.out.println("Insufficient Funds");
            }
            else{
            
            System.out.println("Please enter how much you wwant to transfer");
            int transMoney= sc.nextInt();
            if(Bal>transMoney){
                System.out.println("You money is tranfered ");
                Bal=Bal-transMoney;
            }
           
            }
            break;

            default:
            break;

        }
       
       
        
    }
}