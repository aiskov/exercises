package exercises;

public class PalindromeStringSample implements PalindromeString {

    public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        input = input.trim().toLowerCase();

        if (input.isEmpty()) {
            return false;
        }

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
