import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how long you want prime numbers from 1");
        int n = sc.nextInt();
        int temp=0;
        for( int j=1;j<=n;j++){
            for(int i=2;i<=j-1;i++){
                if(n%i==0){
                    temp=temp+1;
                }
               
    
    
            }
            if(temp==0){
                System.out.println(" Prime No: " + j);
            }
            else{
                temp =0;
            }
            
            

        }
    
        
    }
    
}
