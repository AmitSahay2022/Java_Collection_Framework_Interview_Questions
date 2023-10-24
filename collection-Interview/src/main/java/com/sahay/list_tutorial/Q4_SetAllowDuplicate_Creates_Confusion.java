package com.sahay.list_tutorial;

import java.util.HashSet;
import java.util.Set;

public class Q4_SetAllowDuplicate_Creates_Confusion {

	public static void main(String[] args) {
		Set<Student> set=new HashSet<Student>();
		set.add(new Student(101, "Amit"));
		set.add(new Student(101, "Amit"));
		Student s1=new Student(102, "Sumit");
		Student s2=new Student(102, "Sumit");
		set.add(s1);
		set.add(s2);
		set.stream().forEach(System.out::println);
		
		//If we are adding primitives then fine but if we are adding Custom object then 
		      //must override hashCode() and equals() method

	}

}
