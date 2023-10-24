package com.sahay.list_tutorial;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q2_CreateAFinalListAndAddItems {
	private static final List<String> list = new ArrayList<String>(); //final list means cannot re-asine it
	
	private static List<Integer> list2=new ArrayList<Integer>();

	public static void main(String[] args) {
		list.add("Amit");
		list.add("Sunny");
		list.add("Katrina");
		System.out.println(list);
		
		list2=new LinkedList<Integer>(); //we can re asign  it

	}

}
