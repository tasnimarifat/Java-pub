import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (double) i / Math.pow(2, i);
        }

        System.out.println("Sum of series = " + sum);

        sc.close();
    }
}

