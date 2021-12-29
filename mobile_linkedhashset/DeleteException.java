package com.thoughtfocus.mobile_linkedhashset;

public class DeleteException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Not deleted...";
	}
}
