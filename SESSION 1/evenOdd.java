import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        int[] numbers = new int[5]; 
        int evenCount = 0;
        int oddCount = 0;
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt(); 
        }
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++; 
            } else {
                oddCount++;  
            }
        }
        
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
        
        scanner.close();
    }
}
