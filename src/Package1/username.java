package Package1;
import java.util.Scanner;

public class username {
    public static int uname;
    static Scanner sc = new Scanner(System.in);

    public username() {
        System.out.println("Enter your username:");
        uname = sc.nextInt();
    }
}
