import java.util.Scanner;
public class Task6_3 {


    public static int reverse(int number) {
        String reversed = "";

        while (number != 0) {
            reversed += number % 10;
            number = number / 10;
        }

        return Integer.parseInt(reversed);
    }

    public static boolean  isPalindrome (int number) {
        if (number == reverse(number))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Reversed: " + reverse(number));

        if (number == reverse(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}