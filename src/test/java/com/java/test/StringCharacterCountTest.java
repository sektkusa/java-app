package com.java.test;


import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

/**
 * Unit test for String Character Count.
 */
public class StringCharacterCountTest
{

    @Test
    public void testFindCharacterCount_validInput_Success() {
        Map<Character, Integer> res = StringCharacterCount.findCharacterCount("amudha ranjani");
        Assert.assertNotNull(res);
        Assert.assertEquals("4", String.valueOf(res.get('a')));
        Assert.assertEquals("1", String.valueOf(res.get(' ')));
        Assert.assertEquals("1", String.valueOf(res.get('m')));
    }
}
