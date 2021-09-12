import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a Number to check Armstrong : ");
        int no = sc.nextInt();
        int n =no;
        int t1=no;
        int q;
        int length=0;
        int rem;
        int mult=1;
        int sum=0;
                            //0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
        while(n!=0){
            n=n/10;
           
            length= length+1;
           

        }
        while(t1!=0){
            rem = t1%10;
            for(int i=1;i<=length;i++){
               
                mult=mult*rem;
                t1= t1/10;
    
    
    
    
            }
            sum=sum+mult;
            

        }
        if(sum==no){
            System.out.println("No is ArmStrong");

        }
        else{
            System.out.println(" Not a ArmStrong ");
        }
        



        
    }
    
}
