import java.util.Scanner;

public class RWD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int[] elements = new int[5];     
     
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextInt(); 
        }

        System.out.println("You entered:");
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
       
        scanner.close();
    }
}
