package com.lgy.cn.array;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private Position position;
	
	public Employee(int _id,String _name,Position _postion){
		id = _id;
		name = _name;
		position = _postion;
	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
enum Position{
	
}
