public class operatorExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        a += 5;
        System.out.println("Value of a = " + a);

        a++;
        System.out.println("Increment = " + a);

        b--;
        System.out.println("Decrement = " + b); 

        System.out.println("Positive = " + (+b));
        System.out.println("Negative = " + (-b));

        System.out.println("a is greater than b = " + (a > b));
    }
}


