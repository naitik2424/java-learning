import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine();
        
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Reversed word: " + rev);
       
        if (str.equalsIgnoreCase(rev)){
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
    }
}
