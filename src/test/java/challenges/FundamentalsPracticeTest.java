package challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class FundamentalsPracticeTest {

    @Test
    public void testSum() {
        assertEquals(8, FundamentalsPractice.sum(3, 5));
    }

    @Test
    public void testFizzBuzz() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15};
        int[] expected = {3, 2, 1};
        assertArrayEquals(expected, FundamentalsPractice.fizzbuzz(arr));
    }

    @Test
    public void testReverseString() {
        assertEquals("olleh", FundamentalsPractice.reverseString("hello"));
        assertEquals("", FundamentalsPractice.reverseString(""));
        assertEquals("a", FundamentalsPractice.reverseString("a"));
    }

    @Test
    public void testMaxInArray() {
        assertEquals(9, FundamentalsPractice.maxInArray(new int[]{1, 5, 3, 9, 2}));
        assertEquals(-1, FundamentalsPractice.maxInArray(new int[]{-5, -1, -9}));
    }

    @Test
    public void testCountVowels() {
        assertEquals(3, FundamentalsPractice.countVowels("banana"));
        assertEquals(0, FundamentalsPractice.countVowels("rhythm"));
        assertEquals(5, FundamentalsPractice.countVowels("aeiou"));
    }

    @Test
    public void testIsPrime() {
        assertTrue(FundamentalsPractice.isPrime(7));
        assertFalse(FundamentalsPractice.isPrime(8));
        assertFalse(FundamentalsPractice.isPrime(1));
        assertTrue(FundamentalsPractice.isPrime(2));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, FundamentalsPractice.factorial(5));
        assertEquals(1, FundamentalsPractice.factorial(0));
        assertEquals(1, FundamentalsPractice.factorial(1));
    }
}
