package com.sahay.list_tutorial;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/*
 * Multiple Threads can perform modification on same Collection if it is ConcurrentHashMap
 */

public class Q12_ConcurrentHashMap {
	static Map<Integer, String> map=new ConcurrentHashMap<>();
	static {
		map.put(101, "Core Java");
		map.put(102, "Spring Boot");
	}
	

	public static void main(String[] args) throws InterruptedException {
		Runnable runnable=()->{		
			
				try {
					map.put(105, "Git and Github");
					Thread.sleep(1000);
					map.put(106, "Docker");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		};
		
		Thread thread=new Thread(runnable);
		thread.start();
		
		Iterator<Integer> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			Integer next = itr.next();
			System.out.println(map.get(next));
			
			Thread.currentThread().sleep(1000);
		}

	}

}
