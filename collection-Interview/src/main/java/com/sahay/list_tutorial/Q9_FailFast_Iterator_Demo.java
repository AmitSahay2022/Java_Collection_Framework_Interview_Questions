package com.sahay.list_tutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q9_FailFast_Iterator_Demo {
	public static void main(String[] args) {
       List<String> list = new ArrayList<>();
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
