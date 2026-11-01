
import java.util.Scanner;

class GreaterNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is Greater Number");
        } 
        else if (b > a) {
            System.out.println(b + " is Greater Number");
        } 
        else {
            System.out.println("Both Numbers are Equal");
        }

        sc.close();
    }
}
