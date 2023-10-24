package com.sahay.list_tutorial;

import java.util.HashSet;
import java.util.Set;

public class Q3_why_set_doesnot_allow_duplicates {
	private static Set<Integer> set = new HashSet<Integer>();

	public static void main(String[] args) {
		set.add(10); // --> go to implementation class add method you will find

		/*
		 * public boolean add(E e) { return map.put(e, PRESENT)==null; }
		 */
		
		//Because set use map to store value. and in map key is unique 
	}
}
