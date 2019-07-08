package com.stackroute.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringBooleanTest {
    StringBoolean test;
    @Before
    public void setUp(){

        test=new StringBoolean();
    }
    @After
    public void tearDown(){

        test=null;
    }
    @Test
    public void testArrayCount(){
        //return boolean value

        Map<String,Boolean> result=test.countArray(new String[]{"a","b","c","d","a","c","c"});
        Map<String,Boolean> map=new HashMap<String, Boolean>();
        map.put("a",true);
        map.put("b",false);
        map.put("c",true);
        map.put("d",false);
        assertEquals(map,result);

    }
    @Test
    //count of repeated words in a list
    public void testNumArrayCount(){
        Map<String,Boolean> result=test.countArray(new String[]{"1","4","5","1","2","2","2"});
        Map<String,Boolean> map=new HashMap<String, Boolean>();
        map.put("1",true);
        map.put("2",true);
        map.put("4",false);
        map.put("5",false);
        assertEquals(map,result);

    }
    @Test
    //count of repeated words in a list
    public void testNgativeArrayCount(){
        Map<String,Boolean> result=test.countArray(new String[]{" "," ","c","d","a","c","c"});
        Map<String,Boolean> map=new HashMap<String, Boolean>();
        map.put(" ",true);
        map.put("a",false);
        map.put("c",true);
        map.put("d",false);
        assertEquals(map,result);

    }
    @Test
    //count of repeated words in a list
    public void testSpecialArrayCount(){
        Map<String,Boolean> result=test.countArray(new String[]{"$","!","#","#","$","^","#"});
        Map<String,Boolean> map=new HashMap<String, Boolean>();
        map.put("!",false);
        map.put("#",true);
        map.put("$",true);
        map.put("^",false);
        assertEquals(map,result);

    }



}