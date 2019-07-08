package com.stackroute.PE5;

import java.util.Map;

public class KeyValue {
 public Map<String,String> valueChange(Map<String,String>map){
     //replace val2 value with val1 value
     map.replace("val2",map.get("val1"));
     map.replace("val1"," ");
     return map;
 }

}
