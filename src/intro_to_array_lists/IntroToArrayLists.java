package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> foods = new ArrayList<String>();
		// 2. Add five Strings to your list
		foods.add("Pizza");
		foods.add("Ice Cream");
		foods.add("Steak");
		foods.add("Fish");
		foods.add("Chicken");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < foods.size(); i++) {
			System.out.println(foods.get(i));
		}
		// 4. Print all the Strings using a for-each loop
		for (String s : foods) {
			System.out.println(s);
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < foods.size(); i++) {
			if (i % 2 == 0) {
				System.out.println(foods.get(i));
			}
		}
		// 6. Print all the Strings in reverse order.
		for (int i = 0; i < foods.size(); i++) {
			System.out.println(foods.get((foods.size() - 1) - i));
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < foods.size(); i++) {
			String s = foods.get(i);
			if (s.contains("e")) {
				System.out.println(foods.get(i));
				
			}
		}
	}
}
