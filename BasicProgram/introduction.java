import java.util.Scanner;

public class introduction {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter your name");
        String name= cs.nextLine();
        System.out.println("Enter your age ");
        int n= cs.nextInt();
        System.out.println(" Enter your Gender");
        String gender = cs.nextLine();
        System.out.println(" Enter your school name");
        String school = cs.nextLine();

        System.out.println(" Your Introduction ");
        System.out.println(" Your name "+ name);
        System.out.println(" Your age :"+ n);
        System.out.println(" Your Gender :"+ gender);
        System.out.println(" Your School name :"+ school);

    }
    
}
