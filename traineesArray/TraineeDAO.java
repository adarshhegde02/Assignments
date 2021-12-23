package com.thought_focus.Afternoon.arrays.traineesArray;

public class TraineeDAO {
	private TraineeDetails details[] = new TraineeDetails[10];
	private int index = 0;

	public void printAll() {
		for (int i = 0; i < details.length; i++) {
			if (details[i].getName() != null || details[i].getTraineeID() != 0 || details[i].getContactNumber() != 0) {
				if (details[i] != null) {
					System.out.println(details[i]);
				}
			}
		}
	}

	public void save(TraineeDetails details) {
		if (details != null) {
			if (index < this.details.length) {
				this.details[index] = details;
				index++;
			} else {
				System.out.println();
				System.out.println("No space...");
			}
		}
	}

	public String delete(String name) {

		for (int i = 0; i < details.length; i++) {
			if (details[i] != null) {
				if (name.equals(details[i].getName())) {
					details[i].setTraineeID(0);
					details[i].setName(null);
					details[i].setContactNumber(0);
					System.out.println();
					return "Trainee details deleted for " + name;
				}
			}
		}
		System.out.println();
		return "Trainee detials not deleted";
	}

	public String update(String oldName, String newName) {

		for (int i = 0; i < details.length; i++) {
			if (details[i] != null) {
				if ((details[i].getName()).equals(oldName)) {
					details[i].setName(newName);
					System.out.println();
					return "Name updated";
				}
			}
		}
		System.out.println();
		return "Name not updated";

	}
}
