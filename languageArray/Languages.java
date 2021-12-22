package com.thought_focus.Afternoon.arrays.languageArray;

public class Languages {
	private String programLanguage[] = new String[15];
	private int index = 0;

	public void printAll() {
		for (int i = 0; i < programLanguage.length; i++) {
			if (programLanguage[i] != null)
				System.out.println(programLanguage[i]);
		}
	}

	public boolean save(String language) {
		if (index < 15) {
			programLanguage[index] = language;
			index++;
			return true;
		} else {
			System.out.println("No space...");
			return false;
		}
	}

	public String delete(String language) {
		for (int i = 0; i < programLanguage.length; i++) {
			if (programLanguage[i].equals(language)) {
				programLanguage[i] = null;
				return "Language is removed form the list...";
			}
		}
		return "Language is not removed from the list...";
	}


}
