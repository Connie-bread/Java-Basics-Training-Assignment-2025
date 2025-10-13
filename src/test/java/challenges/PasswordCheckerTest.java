package challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordCheckerTest {

	@Test
	public void testWeakPasswordShort() {
		assertEquals("Weak", PasswordStrengthChecker.checkPasswordStrength("abc"));
	}

	@Test
	public void testWeakPasswordMissingTypes() {
		// Only lowercase, length >= 8
		assertEquals("Weak", PasswordStrengthChecker.checkPasswordStrength("abcdefgh"));
		// Only digits, length >= 8
		assertEquals("Weak", PasswordStrengthChecker.checkPasswordStrength("12345678"));
	}

	@Test
	public void testModeratePassword() {
		// Missing symbol
		assertEquals("Moderate", PasswordStrengthChecker.checkPasswordStrength("Abcdefg1"));
		// Missing digit
		assertEquals("Moderate", PasswordStrengthChecker.checkPasswordStrength("Abcdefg!"));
		// Missing uppercase
		assertEquals("Moderate", PasswordStrengthChecker.checkPasswordStrength("abcdef1!"));
		// Missing lowercase
		assertEquals("Moderate", PasswordStrengthChecker.checkPasswordStrength("ABCDEF1!"));
	}

	@Test
	public void testStrongPassword() {
		assertEquals("Strong", PasswordStrengthChecker.checkPasswordStrength("Abcdef1!"));
		assertEquals("Strong", PasswordStrengthChecker.checkPasswordStrength("A1b2c3d4!"));
	}

	@Test
	public void testEdgeCases() {
		// Exactly 8 chars, all types
		assertEquals("Strong", PasswordStrengthChecker.checkPasswordStrength("A1b2c3!d"));
		// 8 chars, missing 2 types
		assertEquals("Weak", PasswordStrengthChecker.checkPasswordStrength("Abcdefgh"));
	}

}
