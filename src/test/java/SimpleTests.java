import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTests {
    @Test
    void successTest() {
        assertEquals(true, true);
//        assertTrue(true);
    }

    @Test
    void negativeTest() {
        assertEquals(true, false);
    }

    @Test
    void successWithHamcrestTest() {
        assertThat(true, is(true));
    }

    @Test
    void negativeWithHamcrestTest() {
        assertThat(true, is(false));
    }

    @Test
    @DisplayName("Some positive test")
    void successWithHamcrestAndStepsTest() {
        assertThat(true, is(true));
    }

    @Test
    @DisplayName("Some negative test")
    void negativeWithHamcrestAndStepsTest() {
        assertThat(true, is(false));
    }
}
