import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int res;
        if (operation.equals("sum")) {
            res = a + b;
        } else {
            res = a * b;
        }
        System.out.println("Result: " + (res));
    }
}
