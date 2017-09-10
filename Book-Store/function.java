package bookStore;

import java.util.HashMap;

public class function {

	 private HashMap<Integer,book> bookS = new HashMap<>();
	// bookS = new HashMap<>();

	

	public void addBook(int id, book bo) {
		bookS.put(id, bo);

	}

	public void removeBook(int id) {
		bookS.values().remove(id);
	}

}
