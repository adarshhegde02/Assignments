package bank_crud.com.thoughtfocus.bank;

import java.util.ArrayList;
import java.util.List;

public class AccountHolderDAO {
	private List<AccountHolderDTO> dtos = new ArrayList<AccountHolderDTO>();

	public String save(AccountHolderDTO dto) {
		boolean isSaved = dtos.add(dto);
		if (isSaved) {
			return "Data is saved";
		}
		return "Data is not saved";
	}

	public AccountHolderDTO getByName(String name) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getName().equals(name)) {
				return dtos.get(index);
			}
		}
		return null;
	}

	public AccountHolderDTO updateByName(String name, String newName) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index) != null) {
				if (dtos.get(index).getName().equals(name)) {
					dtos.get(index).setName(newName);
					return dtos.get(index);
				}
			}
		}
		return null;
	}

	public String deleteByName(String name) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index) != null) {
				if (dtos.get(index).getName().equals(name)) {
					dtos.remove(index);
					return "Deleted...";
				}
			}
		}
		return "Not deleted...";
	}

	public AccountHolderDTO updatePincodeByArea(String area, int pincode) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getAddress().getArea().equals(area)) {
				dtos.get(index).getAddress().setPincode(pincode);
				return dtos.get(index);
			}
		}
		return null;

	}

	public float getBalance(long accountNo) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getAccountNumber() == accountNo) {
				return dtos.get(index).getBalance();
			}
		}
		return 0.0f;
	}

	public float deposit(float amount, long accountNo) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getAccountNumber() == accountNo) {
				if (amount != 0) {
					dtos.get(index).setBalance(amount+dtos.get(index).getBalance());
					return dtos.get(index).getBalance();
				}
			}
		}
		return 0.0f;
	}

	public float withdraw(float amount, long accountNo) {
		for (int index = 0; index < dtos.size(); index++) {
			if (accountNo == dtos.get(index).getAccountNumber()) {
				if (amount != 0) {
					if (amount <= dtos.get(index).getBalance()) {
						dtos.get(index).setBalance(dtos.get(index).getBalance() - amount);
						return dtos.get(index).getBalance();
					}
				}
			}
		}
		return 0.0f;
	}
}
