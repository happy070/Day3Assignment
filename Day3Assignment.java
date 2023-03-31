import java.util.Scanner;

public class Day3Assignment {
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        scanner.close();

        int result = sum(n);
        System.out.println("The sum of all integers from 1 to " + n + " is: " + result);
    }
}
