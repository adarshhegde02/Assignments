package com.thought_focus.Afternoon.arrays.traineesArray;

public class TraineeDetails {
	private int traineeID;
	private String name;
	private long contactNumber;

	public int getTraineeID() {
		return traineeID;
	}

	public void setTraineeID(int traineeID) {
		this.traineeID = traineeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "TraineeDetails [traineeID=" + traineeID + ", name=" + name + ", contactNumber=" + contactNumber + "]";
	}

}
