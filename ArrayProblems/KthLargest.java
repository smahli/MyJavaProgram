import java.util.Scanner;

public class KthLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index of matrix");   // 6 8 2 4 5 7 2  Elements
                                                       // 0 1 2 3 4 5 6   Index
        int n = sc.nextInt();
        int a[]= new int[n];
        
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("which kth largest position you want as result ");
        int kth=sc.nextInt();
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if(i==kth){
                System.out.println("Second Max Element: "+a[i]);

            }
           
        }
      
    }
    
}
