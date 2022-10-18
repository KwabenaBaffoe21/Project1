package Package1;
import java.util.Scanner;

public class pwd {
   public static String password;
    static Scanner sc = new Scanner(System.in);

    public pwd(){
        System.out.println("Enter your password:");
        password = sc.next();
    }
}
