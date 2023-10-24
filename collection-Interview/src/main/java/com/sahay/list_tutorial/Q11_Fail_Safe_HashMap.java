package com.sahay.list_tutorial;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Q11_Fail_Safe_HashMap {

	public static void main(String[] args) {
		Map<Integer, String> map=new ConcurrentHashMap<>();
		map.put(1, "Amit");
		map.put(2, "Sumit");
		map.put(3, "Sunny Leone");
		
		Iterator<Integer> iterator=map.keySet().iterator();
       
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println(key+" : "+map.get(key));
			map.put(4, "Candice TS");
		}
	}

}
