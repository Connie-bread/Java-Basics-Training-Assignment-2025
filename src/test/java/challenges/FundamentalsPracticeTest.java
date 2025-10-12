package challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FundamentalsPracticeTest {

    @Test
    public void testSum() {
        int[] a = {1,2,3,4};
        assertEquals(10, FundamentalsPractice.sum(a));
    }

    @Test
    public void testAverage() {
        double[] a = {2.0, 4.0, 6.0};
        assertEquals(4.0, FundamentalsPractice.average(a), 1e-6);
    }
}
