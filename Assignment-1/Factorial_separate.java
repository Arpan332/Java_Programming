import java.util.Scanner;
public class FactorialCalculator {
    public static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        int result = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }
}
