package BasicProgram;

public class casting {

// two types of type casting.
// 1. Narrowing type casting
//2. Widening type casting
    public static void main(String[] args) {
        double d =4.5;
        int a = (int) 4.5;  // we will loose 0.5 This is narrowing type casting

        int b = 4;
        double r = b;// we will not loose anything This is called widening casting
        System.out.println(a);
        System.out.println(r);
    }
    
}
