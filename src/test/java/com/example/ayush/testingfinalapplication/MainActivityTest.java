package com.example.ayush.testingfinalapplication;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ayush on 12/12/2017.
 */

public class MainActivityTest {


    @Test
    public void testemailvalidator(){
        //creating main activity's object
        MainActivity main = new MainActivity();
        //checking result in the checkemail method in MainActivity
        boolean result = main.checkemail("name@gmail.com");
        Assert.assertEquals(true, result);
    }
    @Test
    public void testpasswordvalidator(){
        MainActivity main = new MainActivity();
        //checking result in the checkpassword method in MainActivity
        boolean result = main.checkpassword("acadgild123#");
        Assert.assertEquals(true, result);

    }
}