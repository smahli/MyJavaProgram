import java.util.Scanner;

public class MinElement {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index of matrix");
        int n = sc.nextInt();
        int a[]= new int[n];
        
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min = a[0];
        for(int j=1;j<n;j++){
            if(a[j] <=min){
                min =a[j];
            }
        }
        System.out.println("Min is "+min);
    }
}


    

    

