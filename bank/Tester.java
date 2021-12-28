package bank_crud.com.thoughtfocus.bank;

public class Tester {
	public static void main(String[] args) {
		AccountHolderDAO dao = new AccountHolderDAO();

		AccountHolderDTO dto = new AccountHolderDTO();

		AddressDTO adto= new AddressDTO();
		
		adto.setBuilding("#44");
		adto.setArea("Manjalli");
		adto.setLandmark("Hulekal Road");
		adto.setCity("Sirsi");
		adto.setState("Karnataka");
		adto.setCountry("India");
		adto.setPincode(581401);
		
		dto.setAccountNumber(123456789101l);
		dto.setEmail("adarsh@thoughtfocus.com");
		dto.setiFSC("1234TF56");
		dto.setName("Adarsh");
		dto.setBalance(10000.00f);
		dto.setAddress(adto);

		dao.save(dto);

		AccountHolderDTO dto1 = dao.getByName("Adarsh");
		System.out.println(dto1);

		dto1 = dao.updateByName("Adarsh", "adarsh");
		System.out.println(dto1);
		
		dao.updatePincodeByArea("Manjalli", 581402);
		System.out.println(dao.getByName("adarsh"));
		
		System.out.println(dao.getBalance(123456789101l));
		System.out.println(dao.deposit(5000.00f,123456789101l));
		System.out.println(dao.withdraw(5000.00f,123456789101l ));
		
		System.out.println(dao.deleteByName("adarsh"));
		System.out.println(dao.getByName("adarsh"));
		
	}
}
