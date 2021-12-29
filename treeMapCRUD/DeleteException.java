package com.thought_focus.Morning.collections.map.treeMapCRUD;

public class DeleteException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Not deleted...";
	}
}
