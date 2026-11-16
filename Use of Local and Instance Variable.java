public class Main {
    int age = 20; // Instance variable

    void display() {
        String name = "Abir"; // Local variable

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.display();
    }
}

