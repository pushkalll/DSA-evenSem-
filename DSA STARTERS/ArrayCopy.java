import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] ogArray = new int[size];

        System.out.println("Enter your numbers:");
        for (int i = 0; i < ogArray.length; i++) {
            ogArray[i] = input.nextInt();
        }

        int[] newArray = new int[ogArray.length];

        for (int i = 0; i < ogArray.length; i++) {
            newArray[i] = ogArray[i];
        }

        System.out.print("Copied Array: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
        
        input.close();
    }
}
