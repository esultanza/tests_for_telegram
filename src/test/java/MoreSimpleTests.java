import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoreSimpleTests {
    @Test
    void firstTest() {
        assertTrue(true);
    }

    @Test
    void secondTest() {
        assertTrue(true);
    }

    @Test
    void thirdTest() {
        assertTrue(true);
    }

    @Test
    void forthTest() {
        assertTrue(true);
    }

    @Test
    void fifthTest() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void sixTest() {
        assertTrue(true);
    }
}
