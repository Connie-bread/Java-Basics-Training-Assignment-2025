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
        boolean cd1 = false;
        boolean cd2 = false;
        boolean cd3 = false;
        boolean cd4 = false;
        boolean cdLength = false;

        for (int i = 0; i < charString.length; i++) {
            if (Character.isUpperCase(charString[i]) == true) {
                cd1 = true;
            } else if (Character.isLowerCase(charString[i])) {
                cd2 = true;
            } else if (Character.isDigit(charString[i])) {
                cd3 = true;
            } else if (Character.isLetterOrDigit(charString[i]) == false) {
                cd4 = true;
            }
        }

        if (charString.length >= 8) {
            cdLength = true;
        }
        
        if (cd1 == true) {
            strengthRate++;
        } 
        if (cd2 == true) {
            strengthRate++;
        } 
        if (cd3 == true) {
            strengthRate++;
        } 
        if (cd4 == true) {
            strengthRate++;
        } 
        // System.out.println(strengthRate);

        if (strengthRate == 4 && cdLength == true) {
            return "Your password is strong.";
        } else if (strengthRate == 3 && cdLength == true) {
            return "Your password is mid.";
        } else {
            return "Your password is trash.";
        }
    }


}