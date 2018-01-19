package intro_to_file_io;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassChallenge {
	static ArrayList<String> people = new ArrayList<>();
	static HashMap<String, Integer> peoplecount = new HashMap<>();

	void setup() {
		people.add("Fritz");
		people.add("Daniel");
		people.add("Garett");
		people.add("Wren");
		people.add("Fritz");

	}

	public static void main(String[] args) {
		ClassChallenge chal = new ClassChallenge();
		for (String string : people) {
			chal.addPeople(string);

		}
		for (Integer numb : peoplecount.values()) {
			System.out.println();
		}
		// chal.findPopular();
	}

	public void addPeople(String wow) {
		if (peoplecount.get(wow) != null) {
			peoplecount.replace(wow, peoplecount.get(wow) + 1);
		} else {
			peoplecount.put(wow, 1);
		}
	}

	// public void findPopular() {
	// for (String string : people) {
	// peoplecount.put(string, value)
	// for (Integer numb : peoplecount.values()) {
	// }
	// }
	// }

}
