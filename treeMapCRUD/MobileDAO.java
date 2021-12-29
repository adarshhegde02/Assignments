package com.thought_focus.Morning.collections.map.treeMapCRUD;

import java.util.TreeMap;

public class MobileDAO {
	private TreeMap<Integer, MobileDTO> details = new TreeMap<Integer, MobileDTO>();

	public boolean save(int mobileID, MobileDTO dto) {
		if (dto != null) {
			details.put(mobileID, dto);
			return true;
		}
		throw new AddException();
	}

	public void printAll() {
		System.out.println(details);
	}

	public MobileDTO deleteByKey(int mobileID) {
		if (details.containsKey(mobileID)) {
			MobileDTO mobile = details.get(mobileID);
			details.remove(mobileID);
			return mobile;
		}
		throw new DeleteException();
	}

	public MobileDTO updateSerialNumberByKey(int mobileID, int newNumber) {
		if (details.containsKey(mobileID)) {
			MobileDTO mobile = details.get(mobileID);
			mobile.setSerialNo(newNumber);
			return mobile;
		}
		throw new UpdateException();

	}

	public void printByKey(int mobileID) {
		if (!details.isEmpty()) {
			if (details.containsKey(mobileID)) {
				System.out.println();
				System.out.println(details.get(mobileID));
			}
		}
	}
}
