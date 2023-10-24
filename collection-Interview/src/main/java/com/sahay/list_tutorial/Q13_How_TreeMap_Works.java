package com.sahay.list_tutorial;

import java.util.Map;
import java.util.TreeMap;

public class Q13_How_TreeMap_Works {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Map<String, String> map=new TreeMap<>();
        map.put("B", "Ball");
        map.put("C", "Cat");
        map.put("A", "Apple");
        map.entrySet().stream().forEach(k->System.out.println(k));
        System.out.println("-------------------------------------");
        
        System.out.println(map);
	}

}
