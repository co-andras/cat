package hu.falk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArthurizeTest {

    private int cat(int n) {
        if(n == 1) return 1;
        return n + cat(n + 1);
    }

    @Test
    public void testArthurize() {
        Assertions.assertEquals(86736, cat(416));
        System.out.println(cat(1512));
    }
}
