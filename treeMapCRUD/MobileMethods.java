package com.thought_focus.Morning.collections.map.treeMap;

public abstract class MobileMethods {
public abstract void getAll();
public abstract void getAllByBrandName(String brand);
public abstract boolean add(MobileDTO details);
public abstract MobileDTO deleteByMobileID(int mobileID);
public abstract MobileDTO updateBySerialNumber(int serialNumber, int newNumber);
}
