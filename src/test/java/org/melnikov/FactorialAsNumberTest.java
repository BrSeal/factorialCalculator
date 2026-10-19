package org.melnikov;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.melnikov.core.*;

import java.math.BigDecimal;
import java.math.BigInteger;

class FactorialAsNumberTest {

    private static final String FACTORIAL_OF_171_STR = "12410180702176678234248405241031039926166" +
            "05577501693185388951803611996075221691752" +
            "99275197812048758557646495950167038705280" +
            "98898586907107673312420322184843643104735" +
            "77889968548278290754541561964852153468318" +
            "04429323959817369689965723590394761615227" +
            "85581800611763651084288000000000000000000" +
            "00000000000000000000000";

    @Test
    @DisplayName("Factorial is correctly represented as int")
    void testFactorialAsInt() {
        assertEquals(1, Factorial.of(0).intValue());
        assertEquals(1, Factorial.of(1).intValue());

        assertEquals(2, Factorial.of(2).intValue());
        assertEquals(24, Factorial.of(4).intValue());
        assertEquals(720, Factorial.of(6).intValue());
        assertEquals(3628800, Factorial.of(10).intValue());

        assertEquals((int) 1307674368000L, Factorial.of(15).intValue());
        assertEquals(0, Factorial.of(157).intValue());
    }

    @Test
    @DisplayName("Factorial is correctly represented as long")
    void testFactorialAsLong() {
        assertEquals(1, Factorial.of(0).longValue());
        assertEquals(1, Factorial.of(1).longValue());

        assertEquals(2, Factorial.of(2).longValue());
        assertEquals(24, Factorial.of(4).longValue());
        assertEquals(720, Factorial.of(6).longValue());
        assertEquals(1307674368000L, Factorial.of(15).longValue());

        assertEquals(0, Factorial.of(155).longValue());
    }

    @Test
    @DisplayName("Factorial is correctly represented as float")
    void testFactorialAsFloat() {
        assertEquals(1, Factorial.of(0).floatValue());
        assertEquals(1, Factorial.of(1).floatValue());

        assertEquals(2, Factorial.of(2).floatValue());
        assertEquals(24, Factorial.of(4).floatValue());
        assertEquals(720, Factorial.of(6).floatValue());
        assertEquals(2.952328838437621E38, Factorial.of(34).floatValue());
        assertEquals(Float.POSITIVE_INFINITY, Factorial.of(35).floatValue());
    }

    @Test
    @DisplayName("Factorial is correctly represented as double")
    void testFactorialAsDouble() {
        assertEquals(1, Factorial.of(0).doubleValue());
        assertEquals(1, Factorial.of(1).doubleValue());

        assertEquals(2, Factorial.of(2).doubleValue());
        assertEquals(24, Factorial.of(4).doubleValue());
        assertEquals(720, Factorial.of(6).doubleValue());
        assertEquals(1307674368000L, Factorial.of(15).doubleValue());
        assertEquals(4.789142901463393E273, Factorial.of(155).doubleValue());
        assertEquals(7.257415615308004E306, Factorial.of(170).doubleValue());

        assertEquals(Double.POSITIVE_INFINITY, Factorial.of(171).doubleValue());
    }

    @Test
    @DisplayName("Factorial is correctly represented as BigDecimal")
    void testFactorialAsBigDecimal() {
        assertEquals(BigDecimal.ONE, Factorial.of(0).bigDecimalValue());
        assertEquals(BigDecimal.ONE, Factorial.of(1).bigDecimalValue());

        assertEquals(BigDecimal.TWO, Factorial.of(2).bigDecimalValue());

        assertEquals(new BigDecimal(FACTORIAL_OF_171_STR), Factorial.of(171).bigDecimalValue());
    }
}