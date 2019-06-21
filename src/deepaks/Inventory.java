package deepaks;

import java.util.*;

public class Inventory {
	
	//TODO Create a hash map of the inventory. The key will be the SKU number.
	
	public static HashMap<Integer, String> inventory() {
		
		HashMap<Integer, String> inventHash = new HashMap<>();
		inventHash.put(3432, "Car 1");
		inventHash.put(1232, "Car 2");
		inventHash.put(4562, "Car 3");
		inventHash.put(6435, "Car 4");
		inventHash.put(7753, "Car 5");
		inventHash.put(8653, "Car 6");
		inventHash.put(2451, "Car 7");
		inventHash.put(1764, "Car 8");
		inventHash.put(6621, "Car 9");
		
		return inventHash;
		
		
	}
	//TODO create an arraylist for the car values
	
	
	public static void main (String[] args) {
		System.out.println(inventory());
	}
	
}
