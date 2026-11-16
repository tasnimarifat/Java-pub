import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        long a = sc.nextLong();

        System.out.print("Enter second number: ");
        long b = sc.nextLong();

        long x = Math.abs(a);
        long y = Math.abs(b);
        long p = x;
        long q = y;

        while (q != 0) {
            long temp = q;
            q = p % q;
            p = temp;
        }

        if (x == 0 || y == 0) {
            System.out.println("LCM = 0");
        } else {
            System.out.println("LCM = " + ((x / p) * y));
        }

        sc.close();
    }
}

