import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int[] numbers = {10, 20, 30, 40, 50};

            System.out.print("Enter a number : ");
            int target = scanner.nextInt();

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == target) {
                    System.out.println("Number found at index: " + i);
                    return;
                }
            }

            System.out.println("Number not found");
        } finally {
            scanner.close();
        }
    }
}
