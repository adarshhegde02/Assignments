package com.thought_focus.Afternoon.arrays.monthsArray;

public class Tester {
	public static void main(String[] args) {
		Months months = new Months();

		months.save("January");
		months.save("February");
		months.save("March");
		months.save("April");
		months.save("May");
		months.save("June");
		months.save("July");
		months.save("August");
		months.save("September");
		months.save("October");
		months.save("November");
		months.save("December");
		months.printAll();
		months.save("jan");
		System.out.println(months.delete("July"));
		months.printAll();

	}

}
