package lab.exceptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class QuadraticTest {

    @Test
    public void testQuad1() throws Exception {
        Quadratic q1 = new Quadratic(1, 3, -10);
        assertEquals(-5, q1.smallerRoot(), "1x^2 + 3x -10 gives -5");

        Quadratic q2 = new Quadratic(6, 1, -12);
        assertEquals(-3.0 / 2, q2.smallerRoot(), "6x^2 + x -12 gives -3/2");
    }

}
