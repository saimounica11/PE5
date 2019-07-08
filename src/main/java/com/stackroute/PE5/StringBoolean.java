package com.stackroute.PE5;


import java.util.HashMap;
import java.util.Map;

public class StringBoolean {
    public Map<String,Boolean> countArray(String[] input){
        Map<String,Boolean> m=new HashMap<String,Boolean>();

        for(int i=0;i<input.length;i++){
            int count=0;
            for(int j=0;j<input.length;j++){
                //check the count
                if(input[i].equals(input[j])) {
                    count++;
                }
            }

            if(count>=2) {
                m.put(input[i],true);
            }
            else{
                m.put(input[i],false);
            }

        }
        return m;
    }

}

