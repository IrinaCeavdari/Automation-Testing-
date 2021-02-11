import java.util.Scanner;

public class Task3_12 {
    public static void main(String[] args) {

        int number;

        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        if (number / 100 == number % 10)
            System.out.println(number + " is a palindrome");
        else
            System.out.println(number + " is not a palindrome");
    }
}
