
import java.util.Scanner;

public class EqualNotEqual {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Both numbers are Equal");
        } else {
            System.out.println("Both numbers are Not Equal");
        }

        sc.close();
    }
}
