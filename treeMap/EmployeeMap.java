package com.thought_focus.Morning.collections.map.treeMap;

import java.util.TreeMap;

public class EmployeeMap {
private TreeMap<Integer,String> details=new TreeMap<Integer,String>();

public String save(int key,String name) {
	details.put(key,name);
	return "Data saved...";
}

public void printByKey(int key) {
	System.out.println(details.get(key));
}

@Override
public String toString() {
	return "EmployeeMap [details=" + details + "]";
}

public String deleteByKey(int key) {
	details.remove(key);
	return "Data deleted...";
}

public String updateByKey(int key,String name) {
	if(details.containsKey(key)) {
		details.put(key, name);
		return "Name updated...";
	}
	return "Not updated...";
}
}
