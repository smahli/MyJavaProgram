import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index of matrix");   // 6 8 2 4 5 7 2 4 3 2  Elements
                                                      
        int n = sc.nextInt();
        int a[]= new int[n];
        
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        System.out.println(" Duplicate Elements are: ");
        
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if((a[i]==a[j]) && (i!=j)){
                    System.out.println(a[j]+" ");
                    
                }
            }
        
        }
      
    }
    
}
