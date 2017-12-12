package exercises;

public class PalindromStringSample implements PalindromString {

    public boolean isPalindrom(String input) {
        if (input == null || input.isEmpty() || input.trim().isEmpty()) {
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
