package com.stackroute.PE5;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmptyArrayList {
    //create arraylist
    ArrayList<String> list=new ArrayList<String>();

    public ArrayList<String> arraylist(String[] str,int[] index,String[] replace){
        for(int i=0;i<str.length;i++){
            //add list to the array
            list.add(str[i]);
        }
        //if index and items that are replacing are same then go into loop
        if(index.length==replace.length) {
            for (int j = 0; j < index.length; j++) {
                //set and replace list items in the given index
                list.set(index[j], replace[j]);
            }
        }
        else {
            return list;
        }
        return list;
    }
    public ArrayList<String> remove(){
        //to empty arraylist
        list.clear();
        return list;
    }
}
