package com.stackroute.PE5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class KeyValueTest {
    KeyValue test;
    @Before
    public void setUp(){
        test=new KeyValue();
    }
    @After
    public void tearDown(){
        test=null;
    }
    @Test
    public void testKeyvalueChange(){
        //val1 is emptied and val2 is replaced with val1
        HashMap<String, String> input = new HashMap<String, String>();
        input.put("val1", "java");
        input.put("val2", "c++");
        Map<String, String> result= new HashMap<String, String>();
        result= test.valueChange(input);

        HashMap<String, String> output = new HashMap<String, String>();
        output.put("val1", " ");
        output.put("val2", "java");

        assertEquals(output,result);
    }
    @Test
    public void testNullinputKeyvalueChange(){
        //val1 is given empty so that both the strings become empty
        HashMap<String, String> input = new HashMap<String, String>();
        input.put("val1", " ");
        input.put("val2", "abc");
        Map<String, String> result= new HashMap<String, String>();
        result= test.valueChange(input);

        HashMap<String, String> output = new HashMap<String, String>();
        output.put("val1", " ");
        output.put("val2", " ");

        assertEquals(output,result);
    }
    @Test
    public void testNegativeInputKeyvalueChange(){
        //negative numbers are given
        HashMap<String, String> input = new HashMap<String, String>();
        input.put("val1", "-12345");
        input.put("val2", "-6789");
        Map<String, String> result= new HashMap<String, String>();
        result= test.valueChange(input);

        HashMap<String, String> output = new HashMap<String, String>();
        output.put("val1", " ");
        output.put("val2", "-12345");

        assertEquals(output,result);
    }


    @Test
    public void testNumberInputKeyvalueChange(){
        HashMap<String, String> input = new HashMap<String, String>();
        input.put("val1", "678");
        input.put("val2", "123");
        Map<String, String> result= new HashMap<String, String>();
        result= test.valueChange(input);

        HashMap<String, String> output = new HashMap<String, String>();
        output.put("val1", " ");
        output.put("val2", "678");

        assertEquals(output,result);
    }
}