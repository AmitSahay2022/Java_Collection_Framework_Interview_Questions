package com.sahay.list_tutorial;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * (Q) Sort based on name if name is same then sort based on id?
 */

public class Q8_Comparator_TrickyQuestion {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student(110, "Amit"),
				new Student(105, "Sumit"),
				new Student(101, "Katrina"),
				new Student(102, "Amit"),
				new Student(104, "Brock")
				);
		
		Collections.sort(list,new MyCustomComparator());
		list.stream().forEach(i->System.out.println(i));
	}

}
class MyCustomComparator implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
	   if(s1.getName().equalsIgnoreCase(s2.getName())) {
		   return s1.getId()-s2.getId();
	   }else
		return s1.getName().compareToIgnoreCase(s2.getName());
	}
}