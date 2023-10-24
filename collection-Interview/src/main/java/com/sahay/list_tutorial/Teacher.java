package com.sahay.list_tutorial;

public class Teacher implements Comparable<Teacher>{
	private int id;
	private String name;
	private String department;
	@Override
	public int compareTo(Teacher t) {
		//Sort based on id, Default natural sorting
		return this.id-(t.id);
	}

	public Teacher(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id: "+id+" name: "+name+" department: "+department;
	}

}
