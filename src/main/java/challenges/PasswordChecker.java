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


public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Prompt the user to enter a password and read it from input
        // String password = scanner.nextLine();

        // Call the method to check password strength
        // String strength = checkPasswordStrength(password);

        // TODO: Output the strength rating
        // System.out.println(strength);

        scanner.close();
    }

    /**
     * Checks the strength of the given password.
     * Returns "Weak", "Moderate", or "Strong".
     *
     * @param password The password to check
     * @return The strength rating
     */
    public static String checkPasswordStrength(String password) {
        // TODO: Implement the logic to check password strength
        // - Check length
        // - Check for uppercase, lowercase, digit, and symbol
        // - Return the appropriate rating

        return ""; // Placeholder
    }
}