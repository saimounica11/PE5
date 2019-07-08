package com.stackroute.PE5;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringCountTest {
    StringCount test;
    @Before
    public void setUp(){
        test=new StringCount();
    }
    @After
    public void tearDown(){
        test=null;
    }
    @Test
    public void testmapCount(){
        //check if each element in the string is repeated more than once and count
        Map<String,Integer> result=test.stringCount("one_one*two@three");
        Map<String,Integer> expected=new HashMap<String,Integer>();
        expected.put("one",2);
        expected.put("two",1);
        expected.put("three",1);
        assertEquals(expected,result);

    }
    @Test
    public void testmapCount1(){
        Map<String,Integer> result=test.stringCount("one& one^two =three$four");
        Map<String,Integer> expected=new HashMap<String,Integer>();
        expected.put("one",2);
        expected.put("two",1);
        expected.put("three",1);
        expected.put("four",1);
        assertEquals(expected,result);

    }
}