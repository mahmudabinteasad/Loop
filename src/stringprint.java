import java.util.Scanner;

public class stringprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a string: ");
        String name = sc.nextLine();

        //  print Only the uppercase letters in the string
        int length = name.length();
        System.out.println(" UpperCase Letters: ");
        for (int i = 0; i < length; i++) {
            if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
                System.out.printf("%c", name.charAt(i));
            }
        }
        System.out.println();

// b. Every second letter of the string
        System.out.print("Every second letter of the string: ");

        for (int i = 1; i < name.length(); i += 2) {
            System.out.print(name.charAt(i));
        }

        //c. The string, with all vowels replaced by an underscore.
        System.out.println();
        String replacedString = name.replaceAll("[aeiouAEIOU]", "_");
        System.out.println("Replaced String: " + replacedString);

        // d. The number of vowels in the string
        int vowel=0;
        for (int i = 1; i < name.length(); i++) {
            char currentChar = Character.toLowerCase(name.charAt(i));
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowel++;
            }
        }
        System.out.println("numbers of vowel :"+vowel);

        //e.The positions of all vowels in the string.
        System.out.println("The positions of all vowels in the string:");
        for (int i = 0; i < name.length(); i++) {
            char currentChar = Character.toLowerCase(name.charAt(i));
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                System.out.printf("%d ",i);
            }
        }
    }
}