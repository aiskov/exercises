package exercises;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromStringTest {
    private PalindromString target = new PalindromStringSample();

    @Test
    public void isPolindrom_Not() {
        assertFalse(target.isPalindrom("notpalindrom"));
    }

    @Test
    public void isPolindrom_Case1() {
        assertTrue(target.isPalindrom("level"));
    }

    @Test
    public void isPolindrom_Case2() {
        assertTrue(target.isPalindrom("levvel"));
    }

    @Test
    public void isPolindrom_Empty() {
        assertFalse(target.isPalindrom(""));
    }

    @Test
    public void isPolindrom_Null() {
        assertFalse(target.isPalindrom(null));
    }

    @Test
    public void isPolindrom_Blank() {
        assertFalse(target.isPalindrom("    "));
    }
}
