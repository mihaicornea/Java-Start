import java.util.Scanner;


public class Homework3 {
    public static void main(String[] args) {
        // pg6 Continue the implementation of the last case to find out if number is divisible by 10 and by 15.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = scanner.nextInt();

        if (number % 3 == 0) {
            System.out.println("The number is divisible by 3.");
        } else if (number % 5 == 0) {
            System.out.println("The number is divisible by 5.");
        } else if (number % 10 == 0) {
            System.out.println("The number is divisible by 10.");
        } else if (number % 15 == 0) {
            System.out.println("The number is divisible by 15.");
        }

        System.out.println("_________________________________________________");

        // pg23 Write of a method that returns the minimum of three numbers and call
        int smallest = findMinThree(58, 33, 231);
        System.out.println("The smallest number is: " + smallest);

        System.out.println("_________________________________________________");
    }
    public static int findMinThree ( int num1, int num2, int num3) {
        int min = num1;
            // Compare with num2
        if (num2 < min) {
                min = num2;
        }
            // Compare with num3
        if (num3 < min) {
                min = num3;

        return min;
        }
        return min;
    }
}
