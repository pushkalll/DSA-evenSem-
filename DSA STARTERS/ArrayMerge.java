import java.util.Arrays;
import java.util.Scanner; 

public class ArrayMerge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int[] a = new int[input.nextInt()];
        
        System.out.println("Enter numbers for first array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int[] b = new int[input.nextInt()];
        
        System.out.println("Enter numbers for second array:");
        for (int i = 0; i < b.length; i++) {
            b[i] = input.nextInt();
        }
        int[] merged = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            merged[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            merged[a.length + i] = b[i]; 
        }
        System.out.println("Merged: " + Arrays.toString(merged));
        input.close();
    }
}
