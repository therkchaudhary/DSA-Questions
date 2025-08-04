import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      Try swapping values of two numbers:
        // int a = 5;
        // int b = 10;

        // System.out.println("Before swapping: ");
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);

        // int temp = a;
        // a = b;
        // b = temp;

        // System.out.println("After swapping: ");
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);


//-------------------Using scanner-------------------------->
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Before swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}