package com.sahay.list_tutorial;

import java.util.ArrayList;
import java.util.List;

public class Q1_HowToCreateArrayListWhichWillNotAllowDuplicates extends ArrayList{

	@Override
	public boolean add(Object e) {
		// check if item is already present
		if(this.contains(e)) {
			return true;
		}else
		return super.add(e);
	}
	
	public static void main(String[] args) {
		List<Integer> list=new Q1_HowToCreateArrayListWhichWillNotAllowDuplicates();
		list.add(5);
		list.add(5);
		list.add(6);
		list.add(6);
		System.out.println(list);

	}

}
