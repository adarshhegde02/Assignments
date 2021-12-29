package com.thoughtfocus.mobile_linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MobileDAO extends MobileMethods {
	private LinkedHashSet<MobileDTO> details = new LinkedHashSet<>();

	public void getAll() {
		if (!details.isEmpty()) {
			Iterator<MobileDTO> itr = details.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		} else {
			System.out.println("Set is empty...");
		}
	}

	public boolean add(MobileDTO dto) {
		if (dto != null) {
			details.add(dto);
			return true;
		}
		throw new AddException();
	}

	public MobileDTO deleteByMobileID(int mobileID) {
		if (!details.isEmpty()) {
			Iterator<MobileDTO> itr = details.iterator();
			while (itr.hasNext()) {
				MobileDTO mobile = itr.next();
				if(mobileID==mobile.getMobileID()){
					details.remove(mobile);
					return mobile;
				}
			}
		}
		throw new DeleteException();
	}

	public MobileDTO updateBySerialNumber(int serialNumber, int newNumber) {
		if (!details.isEmpty()) {
			Iterator<MobileDTO> itr = details.iterator();
			while (itr.hasNext()) {
				MobileDTO mobile = itr.next();
				if (serialNumber == mobile.getSerialNo()) {
					mobile.setSerialNo(newNumber);
					return mobile;
				}
			}
		}
		throw new UpdateException();

	}

	public void getAllByBrandName(String brandName) {
		if (!details.isEmpty()) {
			Iterator<MobileDTO> itr = details.iterator();
			while (itr.hasNext()) {
				MobileDTO mobile = itr.next();
				if (brandName.equals(mobile.getBrand())) {
					System.out.println();
					System.out.println(mobile);
				}
			}
		}
	}
}
