package exercises;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeStringTest {
    private PalindromeString target = new PalindromStringSample();

    @Test
    public void isPalindrome_Not1() {
        assertFalse(target.isPalindrome("notpalindrom"));
    }

    @Test
    public void isPalindrome_Not2() {
        assertFalse(target.isPalindrome("levil"));
    }

    @Test
    public void isPalindrome_Not3() {
        assertFalse(target.isPalindrome("leve1"));
    }

    @Test
    public void isPalindrome_Not4() {
        assertFalse(target.isPalindrome("levvil"));
    }

    @Test
    public void isPalindrome_Not5() {
        assertFalse(target.isPalindrome("levve1"));
    }

    @Test
    public void isPalindrome_Case1() {
        assertTrue(target.isPalindrome("level"));
    }

    @Test
    public void isPalindrome_Case2() {
        assertTrue(target.isPalindrome("levvel"));
    }

    @Test
    public void isPalindrome_Case3() {
        assertTrue(target.isPalindrome("level "));
    }

    @Test
    public void isPalindrome_Case4() {
        assertTrue(target.isPalindrome("levvel "));
    }

    @Test
    public void isPalindrome_Case5() {
        assertTrue(target.isPalindrome(" level"));
    }

    @Test
    public void isPalindrome_Case6() {
        assertTrue(target.isPalindrome(" levvel"));
    }

    @Test
    public void isPalindrome_Case7() {
        assertTrue(target.isPalindrome("le el"));
    }

    @Test
    public void isPalindrome_Empty() {
        assertFalse(target.isPalindrome(""));
    }

    @Test
    public void isPalindrome_Null() {
        assertFalse(target.isPalindrome(null));
    }

    @Test
    public void isPalindrome_Blank() {
        assertFalse(target.isPalindrome("    "));
    }
}
