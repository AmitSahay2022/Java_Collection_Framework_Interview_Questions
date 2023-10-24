package com.sahay.list_tutorial;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Q10_FailSafe_Iterator {

	public static void main(String[] args) {
		List<String> list=new CopyOnWriteArrayList<String>();
        list.add("A");
        list.add("C");
        
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()) {
        	String next = iterator.next();
        	System.out.println(next);
        	list.add("B");
        }
        
	}

}
