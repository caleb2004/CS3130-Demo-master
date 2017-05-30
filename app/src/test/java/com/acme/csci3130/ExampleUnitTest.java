package com.acme.csci3130;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test//
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }


    @Test
public void IntegerTest() throws Exception{
        int a = 2, b = 2;
        assertEquals(a,b);
    }

    @Test
    public void IntegerTest2() throws Exception{
        int x = 1, y = 2;
        assertFalse(x == y);
    }

    @Test
    public void arrayTest() throws Exception{
        int []a = new int[100];
        for(int i=0;i<100;i++){
            a[i] = i;
        }
        int []b = new int[100];
        for(int i=0;i<100;i++){
            b[i] = i;
        }
        assertArrayEquals(a,b);
    }
}