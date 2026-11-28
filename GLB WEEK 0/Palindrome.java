import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number or word : ");
        String s = sc.next();

        String rev = new StringBuilder(s).reverse().toString();

        if (s.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
