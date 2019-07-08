package com.stackroute.PE5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EmptyArrayListTest {
    EmptyArrayList test;
    @Before
    public void setUp(){

        test=new EmptyArrayList();
    }
    @After
    public void tearDown(){

        test=null;
    }
    @Test
    public void changeArrayList(){
        //replacing values in 0th and 2nd position and empty the array list
        ArrayList<String> list=test.arraylist(new String[]{"apple","grape","melon","berry"},new int[]{0,2},new String[]{"kiwi","mango"});
        ArrayList<String> expected=new ArrayList<String>();
        expected.add("kiwi");
        expected.add("grape");
        expected.add("mango");
        expected.add("berry");
        assertEquals(expected,list);
        System.out.println(list);
        ArrayList <String> empty=new ArrayList<String>();
        ArrayList<String> res=test.remove();
        assertEquals(empty,res);
        System.out.println(res);
    }
    @Test
    public void testChangeArrayList(){
        //only one string is gievn to replace
        ArrayList<String> list=test.arraylist(new String[]{"apple","grape","melon","berry"},new int[]{0,2},new String[]{"mango"});
        ArrayList<String> expected=new ArrayList<String>();
        expected.add("apple");
        expected.add("grape");
        expected.add("melon");
        expected.add("berry");
        assertEquals(expected,list);
        System.out.println(list);
        ArrayList <String> empty=new ArrayList<String>();
        ArrayList<String> res=test.remove();
        assertEquals(empty,res);
        System.out.println(res);
    }
    @Test
    public void testNullInputArrayList(){
        //one string and another empty string is given to replace
        ArrayList<String> list=test.arraylist(new String[]{"abc","de","fg","hij"},new int[]{0,2},new String[]{"xyz"," "});
        ArrayList<String> expected=new ArrayList<String>();
        expected.add("xyz");
        expected.add("de");
        expected.add(" ");
        expected.add("hij");
        assertEquals(expected,list);
        System.out.println(list);
        ArrayList <String> empty=new ArrayList<String>();
        ArrayList<String> res=test.remove();
        assertEquals(empty,res);
        System.out.println(res);
    }
    @Test
    public void testInputArrayList(){
        //replacing only one string
        ArrayList<String> list=test.arraylist(new String[]{"123","45","67","89"},new int[]{1},new String[]{"mno"});
        ArrayList<String> expected=new ArrayList<String>();
        expected.add("123");
        expected.add("mno");
        expected.add("67");
        expected.add("89");
        assertEquals(expected,list);
        System.out.println(list);
        ArrayList <String> empty=new ArrayList<String>();
        ArrayList<String> res=test.remove();
        assertEquals(empty,res);
        System.out.println(res);
    }
    @Test (expected =IndexOutOfBoundsException.class  )

    public void testNegativeInputArrayList(){
        //replacing element which is out of index
        ArrayList<String> list=test.arraylist(new String[]{"123","45","67","89"},new int[]{10},new String[]{"mno"});
        ArrayList<String> expected=new ArrayList<String>();
        expected.add("123");
        expected.add("mno");
        expected.add("67");
        expected.add("89");
        assertEquals(expected,list);
        System.out.println(list);
        ArrayList <String> empty=new ArrayList<String>();
        ArrayList<String> res=test.remove();
        assertEquals(empty,res);
        System.out.println(res);
    }


}