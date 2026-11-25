import java.util.Scanner;

public class PowerOfThree {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the power: ");
            int power = sc.nextInt();

        long result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * 3;
        }

            System.out.println("Result: " + result);
        }
    }
}