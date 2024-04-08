package Test.src;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BetweenTest {
    @Test

    public void between() throws Exception {
        assertEquals("", Between.between(3, 5));
        assertEquals("5", Between.between(3, 7));
        assertEquals("5 7 9", Between.between( 3, 10 ));

    }
}