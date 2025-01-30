package com.sdet;

import org.junit.Assert;
import org.junit.Test;
import Mavenfirst.App;

public class Apptest {

    @Test
    public void testlogin1() {
        App myapp = new App();
        Assert.assertEquals(0, myapp.username("abc", "abc123"));
    }

    @Test
    public void testlogin2() {
        App myapp = new App();
        Assert.assertEquals(1, myapp.userLogin("abc", "abc@123"));
    }
}
