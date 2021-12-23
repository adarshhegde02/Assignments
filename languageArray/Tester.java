package com.thought_focus.Afternoon.arrays.languageArray;

public class Tester {
	public static void main(String[] args) {
		Languages languages = new Languages();

		languages.save("Java");
		languages.save("Pyhton");
		languages.save("JavaScript");
		languages.save("PHP");
		languages.save("Swift");
		languages.save("Ruby");
		languages.save("Perl");
		languages.save("SQL");
		languages.save("TypeScript");
		languages.save("Kotlin");
		languages.save("C Sharp");
		languages.save("C++");
		languages.save("CSS");
		languages.save("HTML");
		languages.save("C");

		languages.printAll();

		languages.save("Dart");

		System.out.println(languages.delete("C"));
		System.out.println(languages.delete("HTML"));
		System.out.println(languages.delete("CSS"));
		System.out.println(languages.delete("C++"));
		System.out.println(languages.delete("C Sharp"));

		languages.update("PHP", "php");

		languages.printAll();

	}
}
