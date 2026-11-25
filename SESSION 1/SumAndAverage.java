import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int[] numbers = new int[5];

            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scanner.nextInt();
            }

            int sum = 0;
            double average;
            for (int i = 0; i < numbers.length; i++) {
                sum = sum + numbers[i];
            }
            average = (double) sum / numbers.length;

            System.out.println("Sum of the elements: " + sum);
            System.out.println("Average of the elements: " + average);
        }
    }
}
