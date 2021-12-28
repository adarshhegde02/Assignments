package bank_linkedhashset.com.thoughtfocus.bank_linkedhashset;

public class DeleteException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Not deleted...";
	}
}
