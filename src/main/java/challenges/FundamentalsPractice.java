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
        int [] array = {0, 0, 0};
        for (int num : arr) {
            if (num % 3 == 0  && num % 5 == 0) {
                System.out.println("FizzBuzz");
                array[2] += 1;
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
                array[0] += 1;
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
                array[1] += 1;
            } else {
                System.out.println(num);
            }
        }
        return array;
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
        char[] charArray = input.toCharArray();
        for (int i = 0; i < Math.round(charArray.length / 2); i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = temp;
        }
        String str = new String(charArray);
        return str;
    }

    /**
     * maxInArray - Given an array of integers, return the largest value.
     * Ex: [1, 5, 3, 9, 2] -> 9
     */
    public static int maxInArray(int[] arr) {
        // Your code goes here
         for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            
            }
            }
        }
        return arr[arr.length-1];
    }

    public static boolean stringsAreSame(String a, String b) {
        // use just .equals() if caps matter, otherwise, use the method below
        if (a.equalsIgnoreCase(b)) {
            System.out.println("strings are equal");
            return true;
        } else {
            System.out.println("strings are not equal");
            return false;
        }
  
        // If strings are equal, return true. Else, return false
        // Hint: use .equals() to compare strings not ==
        // Do not care about capitals HI is equal to hi look up how to do.
    }

    /**
     * countVowels - Given a string, return the number of vowels (a, e, i, o, u) in the string.
     * Ex: "banana" -> 3
     * Hint:
     * - strings can be accessed like this: variable.charAt(0) returns the first character
     */
    public static int countVowels(String input) {
        char[] charVowels = input.toCharArray();
        // Your code goes here
        int vowels = 0;
        for (int i = 0; i < charVowels.length; i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                vowels++;
            }
        }
        return vowels;

    }

    /**
     * isPrime - Given an integer, return true if it is a prime number, false otherwise.
     * Ex: 7 -> true, 8 -> false
     * Hint: to check if n is prime, divide it by all integers from 2 to sqrt(n).
     */
    public static boolean isPrime(int n) {
        // Your code goes here
        boolean prime = true;
        for (double i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
            }
        }
        return prime;
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
        int value = 1;
        for (int i = 2; i <= n; i++) {
            value = (value) * (i);
        }
    return value;
}
    

    // Use for Manual Testing
    public static void main(String[] args) {
        // System.out.println("================ RUNNING CODE ================");
        // // sum
        // int a = 3;
        // int b = 5;
        // System.out.println("sum(" + a + ", " + b + ") = " + sum(a, b)); // Expected: 8

        // // fizzbuzz
        // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 30, 35, 36};
        // System.out.println("fizzbuzz(arr) = " + Arrays.toString(fizzbuzz(arr))); // Expected: [5, 4, 3]

        // // reverseString
        // String str = "hello";
        // System.out.println("reverseString('" + str + "') = '" + reverseString(str) + "'"); // Expected: 'olleh'

        // // maxInArray
        // int[] nums = {1, 5, 3, 9, 2};
        // System.out.println("maxInArray([1,5,3,9,2]) = " + maxInArray(nums)); // Expected: 9

        // // countVowels
        // String word = "banana";
        // System.out.println("countVowels('banana') = " + countVowels(word)); // Expected: 3

        // // isPrime
        // int primeTest = 7;
        // int notPrimeTest = 8;
        // System.out.println("isPrime(7) = " + isPrime(primeTest)); // Expected: true
        // System.out.println("isPrime(8) = " + isPrime(notPrimeTest)); // Expected: false

        // // factorial
        // int factTest = 5;
        // System.out.println("factorial(5) = " + factorial(factTest)); // Expected: 120

        // System.out.println("=============== DONE RUNNING ===============");

        // for static methods (the fundprac.sum print code below) different than calling classes

        System.out.println(FundamentalsPractice.sum(3,7));



        int[] someArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15};
        int[] result = FundamentalsPractice.fizzbuzz(someArray);
        System.out.println(Arrays.toString(result));


        System.out.println(FundamentalsPractice.reverseString("bestfriend"));


        int[] maxArray = {1, 3, 1082, 86, 23};
        System.out.println(FundamentalsPractice.maxInArray(maxArray));

        System.out.println(FundamentalsPractice.stringsAreSame("hi", "hI"));
        System.out.println(FundamentalsPractice.countVowels("eee"));
        System.out.println(FundamentalsPractice.isPrime(9));
        System.out.println(FundamentalsPractice.factorial(5));
    }
}
