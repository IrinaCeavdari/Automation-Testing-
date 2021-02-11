import java.util.Scanner;

public class Task5_49 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter :");
        String s = input.nextLine();


        int Vowels = 0;
        int Consonants = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.toLowerCase().charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    Vowels++;
                    break;
                case ' ':
                    break;
                default:
                    Consonants++;
                    break;

            }
        }

        System.out.println("The number of vowels is " + Vowels);
        System.out.println("The number of consonants is " + Consonants);

    }

}