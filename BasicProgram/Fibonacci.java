public class Fibonacci{
    public static void main(String[] args) {
        




        import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter How long you want Prime no");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int temp=0;
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    temp=temp+1;
                }
                else{
                    temp=0;
                }
               
            }
            if(temp==0){
                System.out.println("Prime No: "+ i);

            }
            else{
                temp=temp+1;
            }

        }
        
    }



    
}

    }
}