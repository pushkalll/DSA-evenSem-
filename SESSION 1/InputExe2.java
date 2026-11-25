import java.util.Scanner;

public class InputExe2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an input size: ");
        int n = input.nextInt(); 
        
        int stepsTaken = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                stepsTaken = stepsTaken + 1; 
            }
        }

        System.out.println("If input size is: " + n);
        System.out.println("The program took " + stepsTaken + " steps.");
        
        input.close();
    }
}