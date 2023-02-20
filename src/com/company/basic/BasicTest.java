package com.company.basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BasicTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalErr = System.err;
    public static Basic basic;


    @BeforeEach
    public void setUpStream() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStream() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @BeforeAll
    static void before() {
        basic = new Basic();
    }

    @Test
    void ex7() {
        assertArrayEquals(Basic.ex7(3), new int[]{3, 6, 9, 12, 15, 18, 21, 24, 27, 30});
    }

    @Test
    void ex8() {
        Basic.ex8();
        assertEquals("   J    a   v     v  a \n" +
                "   J   a a   v   v  a a\n" +
                "J  J  aaaaa   V V  aaaaa\n" +
                " JJ  a     a   V  a     a\n", outContent.toString());
        outContent.reset();
    }
}



