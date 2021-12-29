package com.thought_focus.Morning.collections.map.treeMapCRUD;

public class Tester {
	public static void main(String[] args) {
		MobileDTO details = new MobileDTO();
		details.setBrand("Apple");
		details.setMemory(32);
		details.setMobileID(101);
		details.setModel("iPhone");
		details.setNoofCamera(2);
		details.setSerialNo(101234);
		details.setPrice(25000.00);

		MobileDAO dao = new MobileDAO();

		MobileDTO details1 = new MobileDTO();
		details1.setBrand("Samsung");
		details1.setMemory(32);
		details1.setMobileID(104);
		details1.setModel("Galaxy");
		details1.setNoofCamera(2);
		details1.setSerialNo(104222);
		details1.setPrice(12000.00);

		MobileDTO details2 = new MobileDTO();
		details2.setBrand("Xiaomi");
		details2.setMemory(32);
		details2.setMobileID(107);
		details2.setModel("Redmi");
		details2.setNoofCamera(2);
		details2.setSerialNo(107122);
		details2.setPrice(8000.00);

		MobileDTO details3 = new MobileDTO();
		details3.setBrand("OnePlus");
		details3.setMemory(32);
		details3.setMobileID(105);
		details3.setModel("Nord");
		details3.setNoofCamera(2);
		details3.setSerialNo(105522);
		details3.setPrice(18000.00);

		try {
			dao.save(101, details);
			dao.save(104, details1);
			dao.save(107, details2);
			dao.save(105, details3);
		} catch (AddException e) {
			System.out.println(e.getMessage());
		}

		dao.printAll();

		dao.printByKey(104);

		try {
			System.out.println();
			System.out.println(dao.deleteByKey(107));
		} catch (DeleteException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println();
			System.out.println(dao.updateSerialNumberByKey(105, 105666));
		} catch (UpdateException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		dao.printAll();
	}

}
