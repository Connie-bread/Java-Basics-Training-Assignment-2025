package challenges;
import java.util.Scanner;

/*
 * 🎯 Goal
 *
 * Create a program that:
 * - Takes a password as input.
 * - Checks:
 *     - Length ≥ 8
 *     - Contains uppercase, lowercase, number, and symbol
 * - Outputs a strength rating:
 *     - “Weak”, “Moderate”, or “Strong”
 *     - “Weak” if length < 8 or missing 2+ types
 *     - “Moderate” if length ≥ 8 and missing 1 type
 *     - “Strong” if length ≥ 8 and has all 4 types
 * 
 *
 * 💡 Hints
 * - Loop through each character with: for (char c : password.toCharArray()).
 * - Use Character.isUpperCase(), Character.isLowerCase(), and Character.isDigit().
 * - Symbol = not upper/lower/digit.
 */


public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want your password to be?: ");
        String password = scanner.nextLine();

        // TODO: Prompt the user to enter a password and read it from input
        // String password = scanner.nextLine();
        

        // Call the method to check password strength
        // String strength = checkPasswordStrength(password);
        String strength = checkPasswordStrength(password);

        // TODO: Output the strength rating
        // System.out.println(strength);
        System.out.println(strength);

        scanner.close();
    }

    /**
     * Checks the strength of the given password.
     * Returns "Weak", "Moderate", or "Strong".
     * the things (@param and @return) below are tags for documentation
     *
     * @param password The password to check
     * @return The strength rating
     */
    public static String checkPasswordStrength(String password) {
        // TODO: Implement the logic to check password strength
        // - Check length
        // - Check for uppercase, lowercase, digit, and symbol
        // - Return the appropriate rating
        char[] charString = password.toCharArray();
        int strengthRate = 0;
        // cond = condition
        boolean condUpper = false;
        boolean condLower = false;
        boolean condDigit = false;
        boolean condSymbol = false;
        boolean condLength = false;

        for (int i = 0; i < charString.length; i++) {
            if (Character.isUpperCase(charString[i]) == true) {
                condUpper = true;
            } else if (Character.isLowerCase(charString[i])) {
                condLower = true;
            } else if (Character.isDigit(charString[i])) {
                condDigit = true;
            } else if (Character.isLetterOrDigit(charString[i]) == false) {
                condSymbol = true;
            }
        }

        if (charString.length >= 8) {
            condLength = true;
        }
        
        if (condUpper == true) {
            strengthRate++;
        } 
        if (condLower == true) {
            strengthRate++;
        } 
        if (condDigit == true) {
            strengthRate++;
        } 
        if (condSymbol == true) {
            strengthRate++;
        } 
        // System.out.println(strengthRate);

        if (strengthRate == 4 && condLength == true) {
            return "Strong";
        } else if (strengthRate == 3 && condLength == true) {
            return "Moderate";
        } else {
            return "Weak";
        }
    }


}