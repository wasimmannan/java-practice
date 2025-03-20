package com.test.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapEx {
    public static void main(String args[]) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 100);
        map.put(null, 200);
        System.out.println(map.get(null));
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        hashtable.put(1, 100);
        hashtable.put(1, 200);
        //hashtable.put(null, 300);
        hashtable.put(2, null);
        System.out.println(hashtable.get(2));

    }
}
