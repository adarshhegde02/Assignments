package com.thought_focus.Afternoon.arrays.monthsArray;

public class Months {
	private String months[] = new String[12];
	private int index = 0;

	public void printAll() {
		for (int i = 0; i < months.length; i++) {
			if (months[i] != null)
				System.out.println(months[i]);
		}
	}

	public boolean save(String month) {
		if (index < 12) {
			months[index] = month;
			index++;
			return true;
		} else {
			System.out.println("No space...");
			return false;
		}
	}

	public String delete(String month) {
		for (int i = 0; i < months.length; i++) {
			if (months[i] != null) {
				if (months[i].equals(month)) {
					months[i] = null;
					return "Month is deleted...";
				}
			}
		}
		return "Month is not deleted...";
	}

	public String update(String oldName, String newName) {
		for (int i = 0; i < months.length; i++) {
			if (months[i].equals(oldName)) {
				months[i] = newName;
				return "Month updated";
			}
		}
		return "Month not updated";

	}

}
