package com.thoughtfocus.mobile_linkedhashset;

public class AddException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Not added...";
	}
}
