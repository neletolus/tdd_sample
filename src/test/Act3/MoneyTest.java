package test.Act3;

import main.Act3.Dollar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);

        product = five.times(3);
        assertEquals(15, product.amount);
    }

    @Test
    public void testEquality() {
        // 三角測量（２つのテストで正しさを確認する
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
