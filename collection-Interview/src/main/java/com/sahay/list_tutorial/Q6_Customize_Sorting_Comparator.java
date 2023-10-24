package com.sahay.list_tutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q6_Customize_Sorting_Comparator {

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher(105, "brock", "ufc");
		Teacher teacher2 = new Teacher(102, "rock", "wwe");
		Teacher teacher3 = new Teacher(109, "Cena", "movie");
		Teacher teacher4 = new Teacher(107, "Taker", "show");
		Teacher teacher5 = new Teacher(101, "Gold", "athelet");

		List<Teacher> list = new ArrayList<>();
		list.add(teacher1);
		list.add(teacher2);
		list.add(teacher3);
		list.add(teacher4);
		list.add(teacher5);
		System.out.println("Sorting based on department:");
		Collections.sort(list,(t1,t2)->t1.getDepartment().compareTo(t2.getDepartment()));
		list.stream().forEach(System.out::println);

	}

}
