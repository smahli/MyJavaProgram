import java.util.Scanner;

public class introduction {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        System.out.println("Enter your name");
        String name=cs.next();
        System.out.println("Enter your age ");
        int age= cs.nextInt();
        System.out.println(" Enter your Gender");
        char gender = cs.next().charAt(0);
        System.out.println(" Enter your school name");
        String school = cs.next();
        System.out.println(" Enter your mobile no");
        long mobno= cs.nextLong();

        System.out.println(" Your Introduction ");
        System.out.println(" Your name "+ name);
        System.out.println(" Your age :"+ age);
        System.out.println(" Your Gender :"+ gender);
        System.out.println(" Your School name :"+ school);
        System.out.println(" Your mobile  no :"+ mobno);

    }
    
}
