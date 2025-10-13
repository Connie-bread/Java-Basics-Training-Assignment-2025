package challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordCheckerTest {

	@Test
	public void testWeakPasswordShort() {
		assertEquals("Weak", PasswordChecker.checkPasswordStrength("abc"));
	}

	@Test
	public void testWeakPasswordMissingTypes() {
		// Only lowercase, length >= 8
		assertEquals("Weak", PasswordChecker.checkPasswordStrength("abcdefgh"));
		// Only digits, length >= 8
		assertEquals("Weak", PasswordChecker.checkPasswordStrength("12345678"));
	}

	@Test
	public void testModeratePassword() {
		// Missing symbol
		assertEquals("Moderate", PasswordChecker.checkPasswordStrength("Abcdefg1"));
		// Missing digit
		assertEquals("Moderate", PasswordChecker.checkPasswordStrength("Abcdefg!"));
		// Missing uppercase
		assertEquals("Moderate", PasswordChecker.checkPasswordStrength("abcdef1!"));
		// Missing lowercase
		assertEquals("Moderate", PasswordChecker.checkPasswordStrength("ABCDEF1!"));
	}

	@Test
	public void testStrongPassword() {
		assertEquals("Strong", PasswordChecker.checkPasswordStrength("Abcdef1!"));
		assertEquals("Strong", PasswordChecker.checkPasswordStrength("A1b2c3d4!"));
	}

	@Test
	public void testEdgeCases() {
		// Exactly 8 chars, all types
		assertEquals("Strong", PasswordChecker.checkPasswordStrength("A1b2c3!d"));
		// 8 chars, missing 2 types
		assertEquals("Weak", PasswordChecker.checkPasswordStrength("Abcdefgh"));
	}

}
