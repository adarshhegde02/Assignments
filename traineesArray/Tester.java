package com.thought_focus.Afternoon.arrays.traineesArray;

public class Tester {
	public static void main(String[] args) {
		TraineeDetails details0 = new TraineeDetails();
		TraineeDetails details1 = new TraineeDetails();
		TraineeDetails details2 = new TraineeDetails();
		TraineeDetails details3 = new TraineeDetails();
		TraineeDetails details4 = new TraineeDetails();
		TraineeDetails details5 = new TraineeDetails();
		TraineeDetails details6 = new TraineeDetails();
		TraineeDetails details7 = new TraineeDetails();
		TraineeDetails details8 = new TraineeDetails();
		TraineeDetails details9 = new TraineeDetails();

		details0.setTraineeID(101);
		details0.setName("Adarsh");
		details0.setContactNumber(9898767654l);

		details1.setTraineeID(102);
		details1.setName("Akash");
		details1.setContactNumber(9898767632l);

		details2.setTraineeID(103);
		details2.setName("Rajesh");
		details2.setContactNumber(9898767623l);

		details3.setTraineeID(104);
		details3.setName("Suresh");
		details3.setContactNumber(9898767234l);

		details4.setTraineeID(105);
		details4.setName("Bhuvan");
		details4.setContactNumber(9894567654l);

		details5.setTraineeID(106);
		details5.setName("Amrutha");
		details5.setContactNumber(8898767654l);

		details6.setTraineeID(107);
		details6.setName("Swathi");
		details6.setContactNumber(7898767654l);

		details7.setTraineeID(108);
		details7.setName("Prasad");
		details7.setContactNumber(9877767654l);

		details8.setTraineeID(109);
		details8.setName("Krishna");
		details8.setContactNumber(9234767654l);

		details9.setTraineeID(110);
		details9.setName("Jyothi");
		details9.setContactNumber(9895567654l);

		TraineeDAO dao = new TraineeDAO();
		dao.save(details0);
		dao.save(details1);
		dao.save(details2);
		dao.save(details3);
		dao.save(details4);
		dao.save(details5);
		dao.save(details6);
		dao.save(details7);
		dao.save(details8);
		dao.save(details9);

		dao.printAll();

		System.out.println(dao.delete("Jyothi"));
		dao.printAll();

		details9.setTraineeID(110);
		details9.setName("Radhika");
		details9.setContactNumber(9895567654l);

		dao.save(details9);
		dao.printAll();

		System.out.println(dao.update("Radhika", "Radha"));
		dao.printAll();

	}
}
