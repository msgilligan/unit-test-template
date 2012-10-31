package com.msgilligan.dojo;

import org.junit.*; 

public class TestAdder {

    @Test
    public void testAdd() {
        Assert.assertEquals("Addition failed", Adder.add(1,1), (Integer) 2);
    }

}
