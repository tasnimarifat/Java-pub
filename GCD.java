import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = Math.abs(sc.nextInt());

        System.out.print("Enter second number: ");
        int b = Math.abs(sc.nextInt());

        int x = a;
        int y = b;

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        System.out.println("GCD = " + x);

        sc.close();
    }
}

