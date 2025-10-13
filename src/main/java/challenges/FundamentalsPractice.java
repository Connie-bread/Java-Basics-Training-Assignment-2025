package challenges;

/**
 * FundamentalsPractice - small helper methods + main for manual testing.
 * Students will implement the methods below so unit tests can call them.
 */

import java.util.*;

public class FundamentalsPractice {

    // Example: sum of two integers
    public static int sum(int a, int b) { // The values in parentheses are set for you. Ex: Here a and b are assigned to integers and can be used in code
        int total = a + b; // Your code goes here
        return total; // To submit the answer, return it like this.
    }

    /**
     * fizzbuzz - You are given an array of ints.
     * Print "Fizz" for multiples of 3,
     * "Buzz" for multiples of 5,
     * and "FizzBuzz" for multiples of both 3 and 5.
     * For other numbers, print the number itself.
     * RETURN an array (NOT ARRAYLIST) that contains the number of times ["Fizz", "Buzz", "FizzBuzz"] were printed.
     * Ex: Given [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15], you would RETURN: [3, 2, 1]
     */
    public static int[] fizzbuzz(int[] arr) {
        return null;
    }

    /**
     * reverseString - Given a String, return the reverse of the string.
     * Ex: "hello" -> "olleh"
     * Hint: You can convert an arary of characters back to a string like this:
     * char[] charArray = {'h', 'e', 'l', 'l', 'o'};
     * String str = new String(charArray); // str is "hello"
     * Hint: You can convert a string to an array of characters like this:
     * String str = "hello";
     * char[] charArray = str.toCharArray(); // charArray is ['h', 'e', 'l', 'l', 'o']
     */
    public static String reverseString(String input) {
        // Your code goes here
        return null;
    }

    /**
     * maxInArray - Given an array of integers, return the largest value.
     * Ex: [1, 5, 3, 9, 2] -> 9
     */
    public static int maxInArray(int[] arr) {
        // Your code goes here
        return 0;
    }

    public static boolean stringsAreSame(String a, String b) {
        // If strings are equal, return true. Else, return false
        // Hint: use .equals() to compare strings not ==
        // Do not care about capitals HI is equal to hi look up how to do.
        return false;
    }

    /**
     * countVowels - Given a string, return the number of vowels (a, e, i, o, u) in the string.
     * Ex: "banana" -> 3
     * Hint:
     * - strings can be accessed like this: variable.charAt(0) returns the first character
     */
    public static int countVowels(String input) {
        // Your code goes here
        return 0;
    }

    /**
     * isPrime - Given an integer, return true if it is a prime number, false otherwise.
     * Ex: 7 -> true, 8 -> false
     * Hint: to check if n is prime, divide it by all integers from 2 to sqrt(n).
     */
    public static boolean isPrime(int n) {
        // Your code goes here
        return false;
    }

    /**
     * factorial - Given a non-negative integer n, return n! (n factorial).
     * Ex: 5 -> 120
     * Hint: n! = n * (n-1) * (n-2) * ... * 1, and 0! = 1
     * don't use recursion.
     * THIS ONE IS HARD
     */
    public static long factorial(int n) {
        // Your code goes here
        return 0L;
    }

    

    // Use for Manual Testing
    public static void main(String[] args) {
        System.out.println("================ RUNNING CODE ================");
        // sum
        int a = 3;
        int b = 5;
        System.out.println("sum(" + a + ", " + b + ") = " + sum(a, b)); // Expected: 8

        // fizzbuzz
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 30, 35, 36};
        System.out.println("fizzbuzz(arr) = " + Arrays.toString(fizzbuzz(arr))); // Expected: [5, 4, 3]

        // reverseString
        String str = "hello";
        System.out.println("reverseString('" + str + "') = '" + reverseString(str) + "'"); // Expected: 'olleh'

        // maxInArray
        int[] nums = {1, 5, 3, 9, 2};
        System.out.println("maxInArray([1,5,3,9,2]) = " + maxInArray(nums)); // Expected: 9

        // countVowels
        String word = "banana";
        System.out.println("countVowels('banana') = " + countVowels(word)); // Expected: 3

        // isPrime
        int primeTest = 7;
        int notPrimeTest = 8;
        System.out.println("isPrime(7) = " + isPrime(primeTest)); // Expected: true
        System.out.println("isPrime(8) = " + isPrime(notPrimeTest)); // Expected: false

        // factorial
        int factTest = 5;
        System.out.println("factorial(5) = " + factorial(factTest)); // Expected: 120

        System.out.println("=============== DONE RUNNING ===============");
    }
}
