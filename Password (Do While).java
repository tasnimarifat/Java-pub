import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password;
        String correctPassword = "java123";

        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();

            if (!password.equals(correctPassword)) {
                System.out.println("Wrong password! Try again.");
            }
        } while (!password.equals(correctPassword));

        System.out.println("Login successful!");

        sc.close();
    }
}

