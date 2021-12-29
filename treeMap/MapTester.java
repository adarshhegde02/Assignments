package com.thought_focus.Morning.collections.map.treeMap;

public class MapTester {
public static void main(String[] args) {
	EmployeeMap emp=new EmployeeMap();
	emp.save(101, "Adarsh");
	emp.save(102,"Bhuvan");
	emp.save(103,"Charan");
	emp.save(104, "dhanush");
	emp.save(105, "Ganesh");
	
	System.out.println(emp);
	emp.printByKey(101);
	
	emp.updateByKey(104, "Dhanush");
	System.out.println(emp);
	
	emp.deleteByKey(103);
	System.out.println(emp);
}
}
