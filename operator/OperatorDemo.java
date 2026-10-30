
public class OperatorDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Original value of a = " + a);
        System.out.println("Pre-increment = " + (++a));
        System.out.println("Post-increment = " + (a++));
        System.out.println("After increment = " + a);

        System.out.println("Original value of b = " + b);
        System.out.println("Pre-decrement = " + (--b));
        System.out.println("Post-decrement = " + (b--));
        System.out.println("After decrement = " + b);
    }
}
