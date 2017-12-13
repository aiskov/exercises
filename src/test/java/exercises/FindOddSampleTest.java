package exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindOddSampleTest {
    private FindOdd target = new FindOddSample();

    @Test
    public void findIt_case1() throws Exception {
        assertEquals(5, target.findIt(5, 1, 1, 2, 2, 3, 3));
    }

    @Test
    public void findIt_case2() throws Exception {
        assertEquals(5, target.findIt(1, 2, 3, 5, 3, 2, 1));
    }

    @Test
    public void findIt_case3() throws Exception {
        assertEquals(5, target.findIt(1, 1, 2, 2, 3, 3, 5));
    }

    @Test
    public void findIt_case4() throws Exception {
        assertEquals(1, target.findIt(1));
    }

    @Test
    public void findIt_case5() throws Exception {
        assertEquals(1, target.findIt(1, 1, 1));
    }

    @Test
    public void findIt_case6() throws Exception {
        assertEquals(2, target.findIt(1, 1, 2, 2, 2, 3, 3));
    }

    @Test
    public void findIt_case7() throws Exception {
        assertEquals(3, target.findIt(1, 1, 2, 2, 3, 3, 3));
    }

    @Test(expected = IllegalStateException.class)
    public void findIt_notFound1() throws Exception {
        assertEquals(1, target.findIt(1, 1, 2, 2, 3, 3));
    }

    @Test(expected = IllegalStateException.class)
    public void findIt_notFound2() throws Exception {
        assertEquals(1, target.findIt(1, 1, 1, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void findIt_null() throws Exception {
        target.findIt(null);
    }

    @Test(expected = IllegalStateException.class)
    public void findIt_empty() throws Exception {
        target.findIt();
    }
}