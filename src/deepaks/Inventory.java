package deepaks;

import java.util.*;

public class Inventory {
	
	//TODO Create a hash map of the inventory. The key will be the SKU number.
	
	public static HashMap<Integer, String> inventory() {
		
		HashMap<Integer, String> inventHash = new HashMap<>();
		inventHash.put(3432, "Car 1");
		inventHash.put(1232, "Car 2");
		inventHash.put(4562, "Car 3");
		
		return inventHash;
		
		
	}
	//TODO create an arraylist for the car values
	
	
	public static void main (String[] args) {
		System.out.println(inventory());
	}
	
}
