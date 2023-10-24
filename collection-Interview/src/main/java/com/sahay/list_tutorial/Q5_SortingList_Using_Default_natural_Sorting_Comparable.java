package com.sahay.list_tutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q5_SortingList_Using_Default_natural_Sorting_Comparable {

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher(105, "brock", "ufc");
		Teacher teacher2 = new Teacher(102, "rock", "wwe");
		Teacher teacher3 = new Teacher(109, "Cena", "wwe");
		Teacher teacher4 = new Teacher(107, "Taker", "wwe");
		Teacher teacher5 = new Teacher(101, "Gold", "athelet");

		List<Teacher> list = new ArrayList<>();
		list.add(teacher1);
		list.add(teacher2);
		list.add(teacher3);
		list.add(teacher4);
		list.add(teacher5);
		
		System.out.println("Before Sorting: ");
		list.stream().forEach(System.out::println);
		System.out.println("----------------------------------------------");
		Collections.sort(list);
		System.out.println("After Sorting");
		list.stream().forEach(t->System.out.println(t));
	}

}
