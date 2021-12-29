package com.thoughtfocus.mobile_linkedhashset;

public class MobileDTO {
	private int mobileID;
	private String brand;
	private String model;
	private int serialNo;
	private double price;
	private int noofCamera;
	private int memory;

	public int getMobileID() {
		return mobileID;
	}

	public void setMobileID(int mobileID) {
		this.mobileID = mobileID;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoofCamera() {
		return noofCamera;
	}

	public void setNoofCamera(int noofCamera) {
		this.noofCamera = noofCamera;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "MobileDetails [mobileID=" + mobileID + ", brand=" + brand + ", model=" + model + ", serialNo="
				+ serialNo + ", price=" + price + ", noofCamera=" + noofCamera + ", memory=" + memory + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + memory;
		result = prime * result + mobileID;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + noofCamera;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + serialNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MobileDTO other = (MobileDTO) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (memory != other.memory)
			return false;
		if (mobileID != other.mobileID)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (noofCamera != other.noofCamera)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (serialNo != other.serialNo)
			return false;
		return true;
	}
	
	

}
